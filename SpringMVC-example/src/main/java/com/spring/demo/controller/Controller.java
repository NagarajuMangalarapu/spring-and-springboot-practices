package com.spring.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
@GetMapping
public String m1()
{
	return "example.html";
}
}
