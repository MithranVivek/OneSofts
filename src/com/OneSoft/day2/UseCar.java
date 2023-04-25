package com.OneSoft.day2;

public class UseCar {

	public static void main(String[] args) {
		Car c = new Car();
		c.brand = "Hundai";
		c.price = 1249999;
		c.colour = "Red";
		c.taxAmount = 125789;
		c.netPrice = c.price + c.taxAmount;

		System.out.println("Brand = " + c.brand + "\n" + "Colour = " + c.colour + "\n" + "Net Amount = " + c.netPrice);
	}

}
