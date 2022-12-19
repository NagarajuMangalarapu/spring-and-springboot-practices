package com.lm.junit.junitAssert;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lm.Service.Message;

public class Testmessage 
{
	//Declare variables
	private Message m;
	private String expected;
	private String actual;
	
	//provide init-Data
	@BeforeEach
	public void setUp()
	{
	   m = new Message();
	   expected = "Welcome to :SAM";
	   actual = "";
	}
	//Do Unit Test
	@Test
	public void testshowMessage()
	{
		 actual = m.showMsg("SAM");
	   	
	   	assertEquals(expected,actual,"check the name");
	}
	
	//clear heap data / clear memory
	@AfterEach
	public void clean()
	{
		m=null;
		expected = actual = null;
	}

}
