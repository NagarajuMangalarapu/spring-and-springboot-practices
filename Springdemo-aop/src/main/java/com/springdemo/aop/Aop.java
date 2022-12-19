package com.springdemo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {

	@Before("execution(public void addAccount())")
	public void bm()
	{
		System.out.println("before advice");
	}
	
	@Before("execution(public void welcome())")
	public void beforeMethod()
	{
		System.out.println("before the method welcome method");
	}
	
}
