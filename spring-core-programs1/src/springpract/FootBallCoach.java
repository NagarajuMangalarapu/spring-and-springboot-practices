package springpract;

public class FootBallCoach implements Coach 
{

	private FortuneService fortunerservice;
	

	public FootBallCoach(FortuneService fortunrservice) 
	{		
		this.fortunerservice = fortunrservice;
	}

	@Override
	public String getDailyWorkout() 
	{
		
		return "Hey,Practice More";
	}

	@Override
	public String getDailyFortune() {
		
		return fortunerservice.getFortune();
	}

}
