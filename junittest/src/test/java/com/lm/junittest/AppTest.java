package com.lm.junittest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestMethodOrder;


@DisplayName("Testing Employee Task ")
@TestMethodOrder(OrderAnnotation.class)
public class AppTest 
{
	
	  @BeforeAll
	  public static void setup() 
	  { 
	  //setup,init data
	  System.out.println("From setup"); 
	  }
	  
	  @Test 
	  @Order(1) 
	  public void testSave() 
	  { System.out.println("Hello-Save");
	  }
	  
	  @Test 
	  @Order(4) 
	  public void testUpdate() 
	  {
	  System.out.println("Hell0-Update"); 
	  }
	  
	  @Test 
	  @Tag("prod")
	  @Order(3) 
	  public void testDelete() {
	  System.out.println("Hell0-Delete"); }
	  
	  @Test
	  @Tag("div")
	  @Order(2)
	  public void testEdit() { System.out.println("Hell0-Edit"); }
	 
	@RepeatedTest(value = 4 , name="{displayName}-{currentRepetition}/{totalRepetitions}")
	@DisplayName("MULTIPLE TEST")
	public void testMultiple(TestInfo info)
	{
		System.out.println("Hey  "+info.getTestClass().get().getName());
		System.out.println("Hello  "+info.getTestMethod().get().getName());
	    System.out.println("Hoo  "+info.getDisplayName());
	}
	
}
   
