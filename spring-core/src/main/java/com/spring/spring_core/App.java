package com.spring.spring_core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext a = new AnnotationConfigApplicationContext(Config.class);
		Employee e = a.getBean("employee", Employee.class);
		System.out.println(e);
		
		//System.out.println(e.toString());
    }
}
