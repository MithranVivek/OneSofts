package com.OneSoft.oops2_Inheritance;

public class UsePencil_Single {

	public static void main(String[] args) {
		Pencil p = new Pencil();
		p.brand = "Natraj";
		p.price = 90;
		p.color = "Red";
		p.isWood = true;
		p.ledSize = 16;
		p.isExtradark = true;
		System.out.println(p.findQuality(p.price));

	}

}

class StationaryProduct {
	String brand;
	int price;
	String color;
}

class Pencil extends StationaryProduct {
	
	boolean isWood;
	int ledSize;
	boolean isExtradark;
	
	public String findQuality(int price) {
		if(price>30) {
			return "Good";
		}
		else {
			return "bad";
		}
	}
	
}
