package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class dev {
	private int did;
	private String name;
	private String tech;
	@Autowired //search by type 
	@Qualifier("v")//search by name
	private device d1;
	
	
	
	public dev() {
		super();
		System.out.println("Object Created ");
	}
	public device getD1() {
		return d1;
	}
	public void setD1(device d1) {
		this.d1 = d1;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public void show() {
		System.out.println("Showing");
		d1.compile();
	}
}
