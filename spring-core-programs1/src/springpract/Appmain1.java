package springpract;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Appmain1 
{
	public static void main(String[] args) 
   {
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("student.xml");
		HockeyCoach hc = context.getBean("myHockeyCoach",HockeyCoach.class);
		System.out.println(hc instanceof HockeyCoach);
		System.out.println(context instanceof ClassPathXmlApplicationContext);
		System.out.println(hc.getDailyWorkout());
		System.out.println(hc.getDailyFortune());
		System.out.println(hc.getCoachname()+" : CoachName using properties file");
		System.out.println(hc.getTeamname()+" : TeamName using properties file");
	context.close();
	}

}
