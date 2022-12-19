package springcoreannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.spring_core.Employee;

public class Mainclass 
{
public static void main(String[] args) 
{
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    Student student = context.getBean("student",Student.class);
    student.m1();
    System.out.println(student);
    context.close();
    
    Employee emp = new Employee();
   // System.out.println( " "+new Em);

	
}
}
