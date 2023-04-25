package com.OneSoft.function;

public class Laptop {
	
	String brand;
	int price;
	int memory;
	float displaySize;
	
	public String findMaxPrice(Laptop a, Laptop b) {
		if(a.price>b.price) {
			return a.brand;
		}
		else {
			return b.brand;
		}
	}

}
