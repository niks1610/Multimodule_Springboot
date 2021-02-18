package com.craterzone.demo.model;

public class ContactNo {
	
	

	private int id;
	private String cc;
	private String number;
	
	public ContactNo(String cc,String number){
		this.cc = cc;
		this.number = number;
	}
	
	public ContactNo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Mobile [cc=" + cc + ", mobileno=" + number + "]";
	}
	
	

}
