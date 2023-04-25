package com.OneSoft.java8_Features;

public interface Fruit_DefaultKeyword {
	public String color(String color);
	public int price(int price);
	public default float weight(float weight) {
		return weight;
	}

}
