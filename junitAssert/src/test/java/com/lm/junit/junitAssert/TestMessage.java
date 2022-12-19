package com.lm.junit.junitAssert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName("Assert")
public class TestMessage 
{
	@Test
	public void testA()
	{
		String expected = "Hello";
		String actual = "Hello";
		Assertions.assertEquals(expected ,actual,"May be both are not same");
		
	}
  
}
