package com.OneSoft.oops2_Inheritance;

public class UseSports_Single {
	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		sc.brand = "hond";
		sc.price = 2500000;
		sc.model = "xyz";
		sc.speed = 350;
		System.out.println(sc.findNetPrice(10));
	}

}

class Car {
	String brand;
	int price;
	String model;
	public int findNetPrice (int tax) {
		return price+(price*tax/100);
	}
}

class SportsCar extends Car{
	int speed;
}
