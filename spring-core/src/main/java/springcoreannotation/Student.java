package springcoreannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@ComponentScan("springcoreannotation")

@PropertySource("classpath:student.properties")
public class Student {
	
	@Value("${sid}")
	private int sid;
	@Value("${sname}")
	private String sname;
	@Value("${scollege}")
	private String scollege;
	
	public Student() {
		super();}
	public void m1()
	{
		System.out.println("m1 method");
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScollege() {
		return scollege;
	}

	public void setScollege(String scollege) {
		this.scollege = scollege;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", " + (sname != null ? "sname=" + sname + ", " : "")
				+ (scollege != null ? "scollege=" + scollege : "") + "]";
	}

	
}
