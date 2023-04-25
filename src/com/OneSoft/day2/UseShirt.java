package com.OneSoft.day2;

public class UseShirt {
	public static void main(String[] args) {
		Shirt s = new Shirt();
		s.brand = "Ramraj";
		s.colour = "White";
		s.isFullSleeve = true;
		s.isCheckedShirt = false;
		s.shirtSize = 'L';
		s.chestSize = 23.4f;
		s.barcodeNo = 23546754923l;
		s.price = 450;

		Shirt s1 = new Shirt();
		s1.brand = "Ramraj";
		s1.colour = "Green";
		s1.isFullSleeve = false;
		s1.isCheckedShirt = false;
		s1.shirtSize = 'M';
		s1.chestSize = 12.5f;
		s1.barcodeNo = 2354153676l;
		s1.price = 350;

		System.out.println(s.brand + "\n" + s.colour + "\n" + s.isFullSleeve + "\n" + s.isCheckedShirt + "\n"
				+ s.shirtSize + "\n" + s.chestSize + "\n" + s.barcodeNo + "\n" + s.price);

		System.out.println("\n" + s1.brand + "\n" + s1.colour + "\n" + s1.isFullSleeve + "\n" + s.isCheckedShirt + "\n"
				+ s1.shirtSize + "\n" + s1.chestSize + "\n" + s1.barcodeNo + "\n" + s1.price);
	}

}
