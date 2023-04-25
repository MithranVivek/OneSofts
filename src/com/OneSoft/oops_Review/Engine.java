package com.OneSoft.oops_Review;

public class Engine {
	private int capacity;
	private String fuelType;
	
	public Engine(int capacity,String fuelType) {
		this.capacity = capacity;
		this.fuelType = fuelType;
	}
	
	public String toString() {
		return capacity+fuelType;
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setPetrole(String fuelType) {
		this.fuelType = fuelType;
	}

}
