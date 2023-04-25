package com.OneSoft.Exception_Test;

public class UseShirt {

	public static void main(String[] args) throws PriceException {
		Shirt s1 = new Shirt();
		s1.brand = "Ramraj";
		s1.price = 1310;
		s1.color = "White";
		s1.size = "XL";
		
		Shirt s2 = new Shirt();
		s2.brand = "Alen sole";
		s2.price = 2750;
		s2.color = "Red";
		s2.size = "L";
		
		Shirt s3 = new Shirt();
		s3.brand = "Otto";
		s3.price = 2850;
		s3.color = "Green";
		s3.size = "XXL";
		
		Shirt[] shirts = {s1,s2,s3};
		int min = s1.price;
		for(int i=0;i<shirts.length;i++) {
			if(shirts[i].price <min) {
				min = shirts[i].price;
			}
		}
		
		if(min>2000) {
			throw new PriceException("It is costly");
		}
		else {
			System.out.println("Affordable Price");
		}

	}

}
