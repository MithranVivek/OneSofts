package com.OneSoft.java8_Features;

public class UseLaptop {

	public static void main(String[] args) {
		Laptop brand = (price)-> {
			if(price<50000) {
				return "Dell";
			}
			else {
				return "Lenova";
			}
		};
		System.out.println(brand.price(51000));

	}

}
