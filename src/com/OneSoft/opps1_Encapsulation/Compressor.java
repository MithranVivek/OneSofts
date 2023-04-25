package com.OneSoft.opps1_Encapsulation;

public class Compressor {
	private String brand;
	private int price;
	private int capacity;
	private String phaseType;
	
	public void setBrand(String b) {
		brand = b;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(int p) {
		price = p;
	}
	public int getPrice() {
		return price;
	}
	
	public void setCapacity(int c) {
		capacity = c;
	}
	public int getCapacity() {
		return capacity;
	}
	
	public void setPhaseType(String pt) {
		phaseType = pt;
	}
	public String getPhaseType() {
		return phaseType;
	}

}
