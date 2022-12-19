package com.springdemo.service;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

import com.springdemo.model.Student;

@MessagingGateway
public interface IntegrationGateway {
     
	@Gateway(requestChannel="integrate.request.channel")
	public String sendMessage(String message);
    
	@Gateway(requestChannel="integrate.student.gateway.channel")
	public String processStudentDetails(Student student);
	
	@Gateway(requestChannel="router.channel")
	public <T> String process(T Object);

	@Gateway(requestChannel = "integrationflow")
	public String flow();
	

}
