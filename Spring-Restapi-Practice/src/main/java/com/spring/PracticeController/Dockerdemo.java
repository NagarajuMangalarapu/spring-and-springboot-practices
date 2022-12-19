package com.spring.PracticeController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dockerdemo {
	
	@GetMapping("/home")
	public String home()
	{
		return "Wel-come HOme";
	}
	
	

}
