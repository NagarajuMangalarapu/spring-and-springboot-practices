package student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client1
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.sId = 121;
		s1.sName = "Nag";
		s1.sPhoneNo = "7483738477";
		s1.sAddress = "Nandi Roads";
		System.out.println(s1);
		
		//@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
		Student s =context.getBean("stud1",Student.class);
		System.out.println(s);
	}

}
