package com.OneSoft.for3_ObjectArray;

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
		
		Laptop l3 = new Laptop();
		l3.brand="Sony";
		l3.price=32000;
		l3.memory=4;
		l3.displaySize=16.0f;
		
		Laptop l4 = new Laptop();
		l4.brand="Dell";
		l4.price=28000;
		l4.memory=8;
		l4.displaySize=16;
		
		Laptop l5 = new Laptop();
		l5.brand="Asus";
		l5.price=22000;
		l5.memory=2;
		l5.displaySize=14;
		
		Laptop[] laps = {l1,l2,l3,l4,l5};
		
		for(Laptop x : laps) {
			if(x.memory>4) {
				System.out.println(x.brand+", "+x.price+", "+x.memory+", "+x.displaySize);
			}
		}

	}

}
