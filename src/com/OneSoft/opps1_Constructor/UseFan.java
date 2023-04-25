package com.OneSoft.opps1_Constructor;

public class UseFan {

	public static void main(String[] args) {
		Coil c = new Coil(2200, 1200);
		Fan f = new Fan("Usha", 4000, true, c);
		
		System.out.println(f);

	}

}

class Fan {
	private String brand;
	private int price;
	private boolean is4Wings;
	private Coil coil;
	
	public Fan (String brand, int price, boolean is4Wings, Coil coil) {
		this.brand = brand;
		this.price = price;
		this.is4Wings = is4Wings;
		this.coil = coil;
	}
	public String toString() {
		return brand+" "+price+" "+is4Wings+"\n"+coil;
	}
	
}

class Coil {
	private int capacity;
	private int price;
	
	public Coil(int a, int b) {
		capacity = a;
		price = b;
	}
	public String toString() {
		return "Capacity="+capacity+" Price="+price;
	}
	
}
