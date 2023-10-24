package com.thymeleaf.demo.model;

public class Employee {
	private int id;
	private String FName;
	private String LName;
	private String email;
	
	public Employee(){
		
	}
	
	
	public Employee(int id, String fName, String lName, String email) {
		super();
		this.id = id;
		FName = fName;
		LName = lName;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", FName=" + FName + ", LName=" + LName + ", email=" + email + "]";
	}
	
}

