package com.OneSoft.for3_ObjectArray;

public class UseShirt {

	public static void main(String[] args) {
		Shirt shirt1 = new Shirt();
		shirt1.brand = "";
		shirt1.colour = "";
		shirt1.isFullHand = true;
		shirt1.price = 450;

		Shirt shirt2 = new Shirt();
		shirt2.brand = "";
		shirt2.colour = "";
		shirt2.isFullHand = false;
		shirt2.price = 650;

		Shirt shirt3 = new Shirt();
		shirt3.brand = "";
		shirt3.colour = "";
		shirt3.isFullHand = true;
		shirt3.price = 1150;

		Shirt shirt4 = new Shirt();
		shirt4.brand = "";
		shirt4.colour = "";
		shirt4.isFullHand = false;
		shirt4.price = 900;

		Shirt shirt5 = new Shirt();
		shirt5.brand = "";
		shirt5.colour = "";
		shirt5.isFullHand = true;
		shirt5.price = 850;

		Shirt[] shirts = { shirt1, shirt2, shirt3, shirt4, shirt5 };
		for (Shirt x : shirts) {
			if (x.isFullHand == true) {
				System.out.println("Net Price = " + (x.price + 500));
			}
		}
	}

}
