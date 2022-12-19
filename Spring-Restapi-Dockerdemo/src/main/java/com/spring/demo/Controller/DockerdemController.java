package com.spring.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DockerdemController {

	public String dockerdemo()
	{
		return "Hello Docker";
	}
	
}
