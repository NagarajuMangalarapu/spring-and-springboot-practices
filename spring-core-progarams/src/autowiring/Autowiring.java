package autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowiring 
{
	public static void main(String[] args) 
	{    
		//read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//get the bean from spring container
		Coach c = context.getBean("tennisCoach",Coach.class);
		//call a method on bean
		
		  System.out.println(c.m1());
		  c.m2(21);
		  //close the context
		   context.close();
		 
		
	}

}
