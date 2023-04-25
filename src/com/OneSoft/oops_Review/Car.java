package com.OneSoft.oops_Review;

import java.util.Arrays;

public class Car implements Vehicle{

	
	private String model;
	private String colour;
	private Engine engine;
	private Tyre[] tyres;

	public Car(String model, String colour, Engine engine, Tyre[] tyres) {
		
		this.model = model;
		this.colour = colour;
		this.engine = engine;
		this.tyres = tyres;
	}

	

	@Override
	public String toString() {
		return "\nModel = "+ model + "\ncolour= t" + colour + "\nengine= "
				+ engine + "\ntyres= " + Arrays.toString(tyres) ;
	}



	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Tyre[] gettyres() {
		return tyres;
	}

	public void settyres(Tyre[] tyres) {
		this.tyres = tyres;
	}


	@Override
	public int price(int price) {
		return price;
	}



	@Override
	public String brand(String brandName) {
		return brandName;
	}



	

}
