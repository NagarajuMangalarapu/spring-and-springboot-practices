package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringMvcApp {
	@GetMapping("/")
	public String showpage()
	{
		return "two.html";
	}
	@GetMapping("/morning")
	public String show()
	{
		return "morning.html";
	}
	

}
