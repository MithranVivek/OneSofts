package com.OneSoft.oops2_Inheritance;

public class UseBike_SuperKeyword {

	public static void main(String[] args) {
		MountainBike m = new MountainBike("ABCD", 200000, true, "Blue", 230);
		System.out.println(m);

	}

}

class Bike {
	private String brand;
	private int price;
	private boolean isPetrol;
	public Bike (String brand, int price, boolean isPetrol) {
		this.brand = brand;
		this.price = price;
		this.isPetrol = isPetrol;
	}
	public String toString() {
		return brand+","+price+","+isPetrol;
	}
}

class MountainBike extends Bike {
	private String color;
	private int weight;

	public MountainBike(String brand, int price, boolean isPetrol,String color,int weight) {
		super(brand, price, isPetrol);
		this.color = color;
		this.weight = weight;
	}
	
	public String toString() {
		return super.toString()+", "+color+", "+weight;
	}
	
	
}
