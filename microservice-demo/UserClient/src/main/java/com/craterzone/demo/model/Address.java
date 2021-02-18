package com.craterzone.demo.model;



public class Address {
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	private int id;
	private String houseNo;
	private String street;
	private String landmark;
	private String city;
	private String state;
	private String country;
	private int pincode;
	private String latitude;
	private String longitude;
	
	public Address(String houseNo,String street,String landmark,String city,String state,String country,int pincode,String latitude,String longitude)
	{
		this.houseNo = houseNo;
		this.street = street;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.latitude = latitude;
		this.longitude = longitude;
		
	}
	
	
	public String getHouseNo() {
		return houseNo;
	}


	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}


	//setter and getter methods
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getLandmark() {
		return landmark;
	}
	
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public int getPincode() {
		return pincode;
	}
	
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public String getLatitude() {
		return latitude;
	}
	
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	public String getLongitude() {
		return longitude;
	}
	
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	
	@Override
	public String toString() {
		return "UsersAddress [houseno=" + houseNo + ", street=" + street + ", landmark=" + landmark + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", pincode=" + pincode + ", latitude=" + latitude
				+ ", longitude=" + longitude + "]";
	}
	
	

}
