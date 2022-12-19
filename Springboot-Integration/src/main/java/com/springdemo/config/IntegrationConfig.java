package com.springdemo.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.Filter;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.core.MessageSelector;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.filter.MessageFilter;
import org.springframework.integration.json.JsonToObjectTransformer;
import org.springframework.integration.json.ObjectToJsonTransformer;
import org.springframework.integration.router.HeaderValueRouter;
import org.springframework.integration.router.PayloadTypeRouter;
import org.springframework.integration.support.json.Jackson2JsonObjectMapper;
import org.springframework.integration.transformer.HeaderEnricher;
import org.springframework.integration.transformer.support.HeaderValueMessageProcessor;
import org.springframework.integration.transformer.support.StaticHeaderValueMessageProcessor;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springdemo.model.Address;
import com.springdemo.model.Employee;
import com.springdemo.model.Student;

@Configuration
//@EnableIntegration
//@IntegrationComponentScan
public class IntegrationConfig {
	
	@Bean
	public MessageChannel ReceiverChannel()
	{
		return new DirectChannel();
	}
	
	@Bean
	public MessageChannel ReplyChannel() {
		return new DirectChannel();
	}
	
	@Transformer(inputChannel="integrate.student.gateway.channel",outputChannel="integrate.student.toconvertobject.channel")
	@Bean
	public HeaderEnricher headerEnricher() {
		
		Map<String,HeaderValueMessageProcessor<String>> addheaders = new HashMap<>();
		addheaders.put("headers1",new StaticHeaderValueMessageProcessor<String>("Test Header 1"));
		addheaders.put("headers2",new StaticHeaderValueMessageProcessor<String>("Test Header 2"));
        HeaderEnricher enricher = new HeaderEnricher(addheaders);
		return enricher;
		
	}
	
	
	@Bean
	@Transformer(inputChannel="integrate.student.toconvertobject.channel",outputChannel="Integration.student.ObjectToJson.channel")
	
	public ObjectToJsonTransformer objectTOJsonTransforme()
	{
		return new ObjectToJsonTransformer(getMapper());
	}
	
	@Bean
	public Jackson2JsonObjectMapper getMapper()
	{
		ObjectMapper mapper = new ObjectMapper();
		return new Jackson2JsonObjectMapper(mapper);
	}
	
	@Bean
	@Transformer(inputChannel="Integration.student.JsonToObject.channel",outputChannel="Integration.student.JsonToObjectTransformer.Channel")
	public JsonToObjectTransformer jsonToObjectTransformer()
	{
		return new JsonToObjectTransformer(Student.class);
	}
	
	
	//PayloadTypeRouter Example
	//@ServiceActivator(inputChannel="router.channel")
	@Bean
	public PayloadTypeRouter router()
	{
		PayloadTypeRouter router = new PayloadTypeRouter();

		router.setChannelMapping(Employee.class.getName(), "integrate.enricer.student.channel");
		router.setChannelMapping(Address.class.getName(), "integrate.enricher.address.channel");
		return router;

	}
	
	
	@Transformer(inputChannel="integrate.enricer.student.channel",outputChannel="header.payload.router.channel")
	@Bean
	public HeaderEnricher headerEnricher1() {
		
		Map<String,HeaderValueMessageProcessor<String>> addheaders = new HashMap<>();
		addheaders.put("headertest",new StaticHeaderValueMessageProcessor<String>("student"));
        HeaderEnricher enricher = new HeaderEnricher(addheaders);
		return enricher;
		
	}
	
	//Transformer Example
	@Transformer(inputChannel="integrate.enricher.address.channel",outputChannel="header.payload.router.channel")
	@Bean
	public HeaderEnricher headerEnricher2() {
		
		Map<String,HeaderValueMessageProcessor<String>> addheaders = new HashMap<>();
		addheaders.put("headertest",new StaticHeaderValueMessageProcessor<String>("address"));
        HeaderEnricher enricher = new HeaderEnricher(addheaders);
		return enricher;
		
	}
	// HeaderValueRouter example
	@ServiceActivator(inputChannel="header.payload.router.channel")
	@Bean
	public HeaderValueRouter headerRouter()
	{
		HeaderValueRouter header = new HeaderValueRouter("headertest");
		header.setChannelMapping("student", "student.channel");
		header.setChannelMapping("address", "address.channel");
		
		return header;
		
	}
	
	
	//Filter Example   *****
	@Filter(inputChannel="router.channel")
	  @Bean
	  public MessageFilter filter()
	  {
		  MessageFilter filter = new MessageFilter(new MessageSelector() {
			
			@Override
			public boolean accept(Message<?> message) {
				
				boolean mess= message.getPayload() instanceof Employee;
				System.out.println(mess+"*****************************************");
                   return mess;
			}
		});
		  System.out.println(filter+"  Hey,I am Here");
		  filter.setOutputChannelName("employee.channel");
		return filter;
		  
	  }
	@Bean
	@ServiceActivator(inputChannel = "integrationflow",outputChannel = "integrationflow1")
	public IntegrationFlow integrationflow()
	{
		System.out.println();
		return null;//channel("integrationflow1");//.gateway("integrationflow1");
		
	}

	
//	return f -> f.channel("address.channel").handle(Address.class, (payload, headers) -> {
//        
//        payload.setCity("Kadapa");
//        payload.setDistict("Kurnool");
//        payload.setPin(516474);
////     MessageBuilder<Employee> newMessage =  MessageBuilder.withPayload(payload).setHeader("Harsha", headers);
////     System.out.println(headers.getId());
//     System.out.println(payload.getCity());
//        return payload;

	
}
