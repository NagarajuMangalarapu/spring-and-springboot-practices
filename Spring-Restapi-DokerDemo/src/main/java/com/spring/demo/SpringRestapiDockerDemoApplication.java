package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringRestapiDockerDemoApplication {

	
	@GetMapping
	public String home()
	{
		return "Wel-Come HOme";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringRestapiDockerDemoApplication.class, args);
	}
	

}
