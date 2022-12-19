package com.springdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {

	public void addAccount()
	{
		System.out.println(getClass()+"Doing my work : Adding an Account");
	}
	
	public void welcome()
	{
		System.out.println(getClass()+"Hey wellcome to AOP before advance");
	}
}
