package com.craterzone.demo.model;




public class User {

	private int user_id;
	private String name;
	private Address address;
	private ContactNo contact;
	private String username;
	private String email;
	private String password;
	
	//parameterized constructor
	public User(String name,String username,String password, Address address,ContactNo contact,String email) {
		
		this.name=name;
		this.username = username;
		this.address=address;
		this.contact = contact;
		this.email = email;
		this.password = password;
		
	}
	//default constructor
	public User() {
		
	}
	//getter and setter method
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setId(int id) {
		this.user_id=id;
	}
	
	public int getId() {
		return this.user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public ContactNo getContact() {
		return contact;
	}
	public void setContact(ContactNo contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
}
