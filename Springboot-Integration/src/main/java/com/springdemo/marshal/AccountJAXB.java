package com.springdemo.marshal;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;

import com.springdemo.model.Student;

public class AccountJAXB {
	
	
	
	public static void Marshaller()
	{
		Account acc = new Account("Nagaraju","HYD","n@gmail.com");
		try {
			JAXBContext jc = JAXBContext.newInstance(Account.class);
			Marshaller ms = jc.createMarshaller();
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ms.marshal(acc,System.out);
			ms.marshal(acc,new File("src/main/resources\\data\\acc.xml"));
			
			System.out.println("***********************");
			
		
			 Student student = new Student();
			JAXBContext ac = JAXBContext.newInstance(Student.class);
			System.out.println("Hi ");
			Marshaller ms1 = jc.createMarshaller();
			System.out.println("hey");
			ms1.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
			System.out.println("hello");
			ms1.marshal(student, System.out);
			System.out.println("hoo");
			ms1.marshal(student,new File("src/main/student.xml"));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage()+"-->I got you");
		}
	}
	
	public static void Unmarshaller()
	{
		try {
			JAXBContext jc = JAXBContext.newInstance(Account.class);
              Unmarshaller ums= jc.createUnmarshaller();
              Account ac = (Account) ums.unmarshal(new File("src/main/resources\\data\\acc.xml"));
		       System.out.println(ac.getUsername());
		       System.out.println(ac.getAddress());
		       System.out.println(ac.getEmail());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage()+"Hey,I got YOu");
			
		}
	}

}
