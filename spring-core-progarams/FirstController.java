package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
@GetMapping("first")
public String method1()
{
	return "one.html";
}

@GetMapping("second")
public String method2()
{
	return "two.html";
}
}
