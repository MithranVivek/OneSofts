package com.OneSoft.oops1_Composition;

public class UseCar {

	public static void main(String[] args) {
		Engine e = new Engine();
		e.capacity = 2000;
		e.isPetrol = false;
		
		Car c = new Car();
		c.brand = "Honda";
		c.model = "Jass";
		c.price = 6000000;
		c.engine = e;
		
		System.out.println(c.brand+"\n"+c.model+"\n"+c.price+"\n"+c.engine.capacity+"\n"+c.engine.isPetrol);

	}

}
