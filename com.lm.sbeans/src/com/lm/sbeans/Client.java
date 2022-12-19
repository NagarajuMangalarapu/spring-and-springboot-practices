package com.lm.sbeans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Client 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException 
	{
 		//Resource res = null;
    	//BeanFactory factory = null;
	//	target = null;
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//Hold the name and location of Configuration file
		//res = new FileSystemResource("com.lm.sbeans/ApplicationContext.xml");
		
	//
	//	factory = new XmlBeanFactory(res);
		//Object obj = factory.getBean("wmg");
		Object obj = context.getBean("wmg");
		//WishMessageGenerate target = factory.getBean("wmg",WishMessageGenerate.class);
	WishMessageGenerate target = context.getBean("wmg",WishMessageGenerate.class);
	
		String result= target.generateWishMessage("Nag");
		System.out.println(result);
		Class c = Class.forName("java.util.Date");
			Object obj1 = c.newInstance();
          System.out.println(obj1);
          System.out.println(obj1.toString());
          
			
	}

}

