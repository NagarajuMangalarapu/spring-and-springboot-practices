package com.hibernateDemo.Hibernate_Table;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Employee {
	@Id
	private int eId;
	private String eName;
	private float eSal;
	private String city;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public float geteSal() {
		return eSal;
	}
	public void seteSal(float eSal) {
		this.eSal = eSal;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", " + (eName != null ? "eName=" + eName + ", " : "") + "eSal=" + eSal + ", "
				+ (city != null ? "city=" + city : "") + "]";
	}
	
	
	
	

}
