package com.OneSoft.day3Test;

public class UsePen12 {

	public static void main(String[] args) {
		Pen12 pen1 = new Pen12();
		Pen12 pen2 = new Pen12();

		pen1.brand = "reynolds";
		pen2.brand = "parker";

		pen1.price = 5;
		pen2.price = 25;

		pen1.color = "blue";
		pen2.color = "black";

		System.out.println(pen1.brand.toUpperCase() + " " + pen2.brand.toUpperCase());

		System.out.println(pen1.brand.contains("a") + " " + pen2.brand.contains("a"));

		System.out.println(pen1.color.equals("BLUE") + " " + pen2.color.equals("black") 
							+ "\n" + pen2.color.charAt(4)+ " " + pen1.color.charAt(2));

		String[] a = pen1.brand.split("n");

		System.out.println(a[0] + "\n" + a[1]);

		System.out.println(pen1.color.length() + pen2.color.length());

	}

}
