package com.spring.democontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Dockerdemo {

	@GetMapping
	public String home()
	{
		return "Well-Come";
	}
}
