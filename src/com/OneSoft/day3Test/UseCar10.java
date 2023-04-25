package com.OneSoft.day3Test;

public class UseCar10 {

	public static void main(String[] args) {
		Car10 car1 = new Car10();
		Car10 car2 = new Car10();
		Car10 car3 = new Car10();

		car1.brand = "Bmw";
		car2.brand = "tata";
		car3.brand = "Swift";

		car1.model = "XVI";
		car2.model = "IX";
		car3.model = "X2V";

		car1.price = 400000;
		car2.price = 300000;
		car3.price = 200000;

		car1.isPetrol = false;
		car2.isPetrol = true;
		car3.isPetrol = true;

		System.out.println("Length = " + car1.brand.length() + "," 
						+ car2.brand.length() + "," + car3.brand.length());

		System.out.println("Total price = " + (car1.price + car2.price + car3.price));

		System.out.println(car1.brand.toUpperCase() + "," + car2.brand.toUpperCase() 
							+ "," + car3.brand.toUpperCase());

	}

}
