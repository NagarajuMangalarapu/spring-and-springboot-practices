package com.spring.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
@RequestMapping
public class Controller1 {
	
	@GetMapping("/")
	public String meth1()
	{
		return "example.html";
	}

}
