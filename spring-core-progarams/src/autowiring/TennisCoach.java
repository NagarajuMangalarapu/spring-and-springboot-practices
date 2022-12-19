package autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach 
{ 
	int num;

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String m1() {
		
		return "This is Magic!";
	}
	public void m2(int num)
	{
		System.out.println("hey,I am in autowiring."+num);
	}

}
