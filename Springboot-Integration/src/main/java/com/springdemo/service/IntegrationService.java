package com.springdemo.service;


import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessagingException;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class IntegrationService {
       
	
	@ServiceActivator(inputChannel="integrate.request.channel")
	public void anotherMessage(Message<String> message) throws MessagingException
	{
		System.out.println(message.getHeaders());
		System.out.println(message.getPayload());
		MessageChannel replychannel = (MessageChannel)message.getHeaders().getReplyChannel();
     
		System.out.println(replychannel);
		MessageBuilder.fromMessage(message);
		Message<String> newmessage = MessageBuilder.withPayload("Well-Come, "+message.getPayload()+
	"  to Spring Integration").build();
		
		replychannel.send(newmessage);
	}
	
	@ServiceActivator(inputChannel="Integration.student.ObjectToJson.channel",outputChannel="Integration.student.JsonToObject.channel")
	public Message<?> receiveChannel(Message<?> message) throws MessagingException
	{
		System.out.println(message);
		System.out.println("********************");
		System.out.println(message.getPayload());
		
		
		return message;
		
	}
	
	@ServiceActivator(inputChannel="Integration.student.JsonToObjectTransformer.Channel")
	public void processJsonToObject(Message<?> message) throws MessagingException
	{
		MessageChannel replaychannel = (MessageChannel)message.getHeaders().getReplyChannel();
		System.out.println(replaychannel);
		MessageBuilder.fromMessage(message);
		System.out.println("***********");
		System.out.println(message.getPayload());
		Message<String> newMessage = MessageBuilder.withPayload("Welcome , "+message.getPayload()+" ").build(); 
			replaychannel.send(newMessage);	
	}
  
	@ServiceActivator(inputChannel = "employee.channel")
	public String receiveMessage(Message<?> message)
	{
		System.out.println("******************* employee**");
		System.out.println(message);
		System.out.println(message.getPayload());
		return "done!";
	}
	
	@ServiceActivator(inputChannel = "address.channel")
	public String getMessage(Message<?> message)
	{
		System.out.println("******************* address*  *");
		System.out.println(message);
		System.out.println(message.getPayload());
		return "done!";
	}
	
	@ServiceActivator(inputChannel = "integrationflow1")
	public String newMessage()
	{
		return "hello";
	}
	
	
//public IntegrationFlow checkInputChannel()
//		{
//		f->f.channel("Integration.message").route("Integration.request.c");
//			System.out.println("hey, I working");
//		}
}
