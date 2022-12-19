package BinarySearchTree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client 
{  
	public Client()
	{
		System.out.println("Hey I am in 0'constructor");
	}
	public Client(int a)
	{
		System.out.println(a+"parameter constructor");
	}

	public static void main(String [] args)
	{
		Client c = new Client();
		System.out.println(c);
		Client c1 = new Client(21);
		System.out.println(c1);
		
	System.out.println("hey");
		 Employee eref = new Employee();
		 eref.eId =142;
		 eref.eName = "Nag";
		 eref.eAddress = "India";
		 System.out.println("Employee details are : "+eref);
		 
		 
		// Resource resource = new ClassPathResource("NewFile.xml");
		
		//BeanFactory factory = new XmlBeanFactory(resource);
	//ClassPathXml
	@SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");

		 Employee emp1 = context.getBean("emp1",Employee.class);
		// emp1.displayInfo();
		 System.out.println(emp1.toString()+"ello");
		 Employee emp2 = context.getBean("emp2",Employee.class);
		 System.out.println(emp2);//.toString());
		 
		
	/*	AnnotationConfigApplicationContext a = new AnnotationConfigApplicationContext(Config.class);
		Employee e = a.getBean("employee", Employee.class);
		System.out.println(e.geteId());
		}*/
		//System.out.println("hey");
		 
	
	}
}


