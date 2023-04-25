package com.OneSoft.opps1_Encapsulation;

public class Mobile {
	private String brand;
	private int price;
	private String color;
	private String model;
	private boolean isAndroid;
	private Battery battery;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	public void setIsAndroid(boolean isAndroid) {
		this.isAndroid = isAndroid;
	}
	
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	public String getModel() {
		return model;
	}
	public Battery getBattery() {
		return battery;
	}
	public boolean getIsAndroid() {
		return isAndroid;
	}

}
