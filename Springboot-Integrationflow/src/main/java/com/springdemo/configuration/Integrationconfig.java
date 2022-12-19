package com.springdemo.configuration;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.MessageChannels;
import org.springframework.integration.dsl.Pollers;
import org.springframework.integration.file.FileReadingMessageSource;
import org.springframework.integration.file.FileWritingMessageHandler;

@Configuration
public class Integrationconfig {

	@Autowired
	private Transformer transformer;
	@Bean
	public IntegrationFlow integrationflow()
	{
		return IntegrationFlows.from(fileReader(),t->t.poller(Pollers.fixedDelay(500)))
                               .transform(transformer,"transform")
				               .handle(fileWriter())
				               .get();
				               
	}

	@Bean
	public  FileWritingMessageHandler fileWriter() {
		
		FileWritingMessageHandler handler = new FileWritingMessageHandler(new File("destination1"));
	System.out.println(handler);
		handler.setExpectReply(false);
		return handler;
	}

	@Bean
	public FileReadingMessageSource fileReader() {
		FileReadingMessageSource source = new FileReadingMessageSource();
		source.setDirectory(new File("source"));
		return source;
	}
	
	 @Bean
	 @ServiceActivator(inputChannel = "Integration.flow.message")
	 public IntegrationFlow routerTwoSubFlows() {
	     return f -> f
	               .split()
	               .<Integer, Boolean>route(p -> p % 2 == 0, m -> m
	                              .subFlowMapping(true, sf -> sf.<Integer>handle((p, h) -> p * 2))
	                              .subFlowMapping(false, sf -> sf.<Integer>handle((p, h) -> p * 3)))
	               .aggregate()
	               .channel(MessageChannels.queue("routerTwoSubFlowsOutput"));
	 }
}
