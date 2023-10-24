package com.example.demo;

import org.springframework.stereotype.Component;

@Component("v")
public class device {
	private int dId;
	private String brand;
	
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "device [dId=" + dId + ", brand=" + brand + "]";
	}
	public void compile() {
		System.out.println("Compiling");
	}
}
