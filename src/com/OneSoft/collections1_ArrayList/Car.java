package com.OneSoft.collections1_ArrayList;

public class Car {
	
	private String brand;
	private int price;
	private String colour;
	private String model;
	
	public Car(String brand, int price, String colour, String model) {
		super();
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.model = model;
	}

	@Override
	public String toString() {
		return "brand=" + brand + ", price=" + price + ", colour=" + colour + ", model=" + model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	

}
