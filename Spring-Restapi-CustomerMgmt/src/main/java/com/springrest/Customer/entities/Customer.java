package com.springrest.Customer.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	private int cId;
	private String cName;
	private Long cPhone;
	private String cLocation;
	public Customer(int cId, String cName, Long cPhone, String cLocation) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cPhone = cPhone;
		this.cLocation = cLocation;
	}
	
	public Customer() {
		super();
	}

	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Long getcPhone() {
		return cPhone;
	}
	public void setcPhone(Long cPhone) {
		this.cPhone = cPhone;
	}
	public String getcLocation() {
		return cLocation;
	}
	public void setcLocation(String cLocation) {
		this.cLocation = cLocation;
	}
	
	
}
