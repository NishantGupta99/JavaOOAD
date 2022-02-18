package com.nishant.entity;

public class User {
	private String name;
	private Long mobileNumber;
	private Byte age; 
	private ROLE role;
	//constructor 
	public void workout() {
		System.out.println("Is working out");
		
	}
	public String getName() {
		return name;
	}
	
	// custom constructor 
	public User(String name, Long mobileNumber, Byte age) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.age = age;
	}
	 public void setName(String name) {
		this.name = name;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	} 
	public Byte getAge() {
		return age;
	}
	public void setAge(Byte age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[name="+name+"]";
	}

}
