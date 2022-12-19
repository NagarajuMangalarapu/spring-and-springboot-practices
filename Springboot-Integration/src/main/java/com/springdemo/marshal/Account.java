package com.springdemo.marshal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;




@XmlRootElement(name="account")
public class Account {
     
	
	
	private String username;
	
	private String address;
	private String email;
	
	
	@XmlElement(name="username")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@XmlElement(name="address")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@XmlElement(name="email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String username, String address, String email) {
		super();
		this.username = username;
		this.address = address;
		this.email = email;}
	
	@Override
	public String toString() {
		return "Account [" + (username != null ? "username=" + username + ", " : "")
				+ (address != null ? "address=" + address + ", " : "") + (email != null ? "e_mail=" + email : "")
				+ "]";
	}
	
}
