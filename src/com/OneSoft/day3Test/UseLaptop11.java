package com.OneSoft.day3Test;

public class UseLaptop11 {

	public static void main(String[] args) {
		Laptop11 laptop1 = new Laptop11();

		laptop1.brand = "Lenova";
		laptop1.color = "Ash";

		System.out.println(laptop1.brand.toUpperCase());
		System.out.println(laptop1.brand.length());
		System.out.println(laptop1.brand.startsWith("D"));
		System.out.println(laptop1.brand.charAt(5));
		System.out.println(laptop1.color.toLowerCase());

	}

}
