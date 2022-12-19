package autowiring;

import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {

	@Override
	public String m1() {
		
		return "This is Magic!";
	}

}
