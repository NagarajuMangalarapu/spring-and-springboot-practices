package com.springdemo.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@XmlRootElement(name="student")
public class Student {

	
	private int sid;
	
	private String sname;
	
	private String institute;
	@XmlElement
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	@XmlElement
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@XmlElement
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, String institute) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.institute = institute;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", " + (sname != null ? "sname=" + sname + ", " : "")
				+ (institute != null ? "institute=" + institute : "") + "]";
	}


	
}
