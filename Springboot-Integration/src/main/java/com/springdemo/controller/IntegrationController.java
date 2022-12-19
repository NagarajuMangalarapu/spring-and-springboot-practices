package com.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.model.Address;
import com.springdemo.model.Employee;
import com.springdemo.model.Student;
import com.springdemo.service.IntegrationGateway;

@RestController
@RequestMapping("/integrate")
public class IntegrationController {

	@Autowired
	private IntegrationGateway integrationgateway;
	
	@GetMapping(value="{name}")
	public String getMessageFromIntegrationService(@PathVariable String name)
	{
		return integrationgateway.sendMessage(name);
		
		}
	
	@PostMapping("/student")
	public String processStudentDetails(@RequestBody Student student) {
		//integrationgateway.channel();
		return integrationgateway.processStudentDetails(student);
	}
	
	@PostMapping("/employee")
	public String process(@RequestBody Employee employee)
	{
		return integrationgateway.process(employee);
	}
	
	@PostMapping("/address")
	public String process(@RequestBody Address address)
	{
		return integrationgateway.process(address);
	}
	
	@GetMapping("/flow/{name}")
	public String flow(@PathVariable String name)
	{
		return integrationgateway.flow();
	}
	
	
}
