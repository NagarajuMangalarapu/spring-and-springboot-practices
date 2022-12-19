package springpract;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Appmain 
{
public static void main(String[] args) 
{
	
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("student.xml");	
Coach coach = context.getBean("myCoach",Coach.class);

System.out.println(coach.getDailyWorkout());
System.out.println(coach.getDailyFortune());
context.close();
}
}
