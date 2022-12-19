package springpract;

public class HockeyCoach implements Coach 
   {
	private FortuneService fortuneservice;
	private String Coachname;
	private String Teamname;
	

	public String getCoachname() {
		return Coachname;
	}


	public void setCoachname(String coachname) {
		Coachname = coachname;
	}


	public String getTeamname() {
		return Teamname;
	}


	public void setTeamname(String teamname) {
		Teamname = teamname;
	}


	public HockeyCoach() {
		System.out.println("HockeyCoach : Inside Construct-noArg");
	}
	

	public void setFortuneService(FortuneService fortuneservice) 
	{   
		System.out.println("HockeyCoach : Inside Setter method");
		this.fortuneservice = fortuneservice;
	}


	@Override
	public String getDailyWorkout() {
		
		return "Start Running at 6 A.M daily";
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneservice.getFortune();
	}

}
