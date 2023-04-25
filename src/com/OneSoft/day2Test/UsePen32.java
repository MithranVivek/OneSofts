package com.OneSoft.day2Test;

public class UsePen32 {

	public static void main(String[] args) {
		Pen32 p = new Pen32();
		p.brand = "Renolds";
		p.price = 15;
		p.isBlueColor = true;
		p.tipWidth = 7;

		Pen32 p1 = new Pen32();
		p1.brand = "Gelly";
		p1.price = 25;
		p1.isBlueColor = true;
		p1.tipWidth = 5;

		Pen32 p2 = new Pen32();
		p2.brand = "MSP";
		p2.price = 30;
		p2.isBlueColor = true;
		p2.tipWidth = 9;

		System.out.println((p.price + p1.price + p2.price) / 3);
	}

}
