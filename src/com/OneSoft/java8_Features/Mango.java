package com.OneSoft.java8_Features;

public class Mango implements Fruit_DefaultKeyword{

	@Override
	public String color(String color) {
		return color;
	}

	@Override
	public int price(int price) {
		return price;
	}
	
	public int findPrice(int price,float weight) {
		int netPrice = (int) (price * weight);
		return netPrice;
	}
	

}
