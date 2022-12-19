package com.springrest.Customer.entities;

public class Product   
{
	private String pid;
	private int pname;
	private float pprice;
	public Product(String pid, int pname, float pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public int getPname() {
		return pname;
	}
	public void setPname(int pname) {
		this.pname = pname;
	}
	public float getPprice() {
		return pprice;
	}
	public void setPprice(float pprice) {
		this.pprice = pprice;
	}
	
	

}
