package com.OneSoft.function;

public class UseLaptop {

	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.brand="Lenova";
		l1.price=25000;
		l1.memory=2;
		l1.displaySize=14.5f;
		
		Laptop l2 = new Laptop();
		l2.brand="Hp";
		l2.price=41000;
		l2.memory=16;
		l2.displaySize=14.0f;
		
		
		
		System.out.println(l1.findMaxPrice(l1, l2));
		

	}

}
