package springpract;

public class BaseBallCoach implements Coach 
{
	private FortuneService fortuneservice;
	

	@Override
	public String getDailyWorkout() {
		
		return "Practice More";
	}


	public BaseBallCoach(FortuneService fortuneservice) {
		
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyFortune() {
		return fortuneservice.getFortune();//"Today is Your Luckyday";
	}

}
