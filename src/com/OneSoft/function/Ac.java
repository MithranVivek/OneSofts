package com.OneSoft.function;

public class Ac {
	
	String brand;
	int price;
	float tone;
	
	public void findMaxPrice(Ac[] a) {
		Ac temp = null;
		int max = 0;
		for(Ac x : a) {
			if(x.price>=max) {
				max=x.price;
				temp = x;
			}
		}
		System.out.println(temp.brand+" "+temp.price+" "+temp.tone);
	}

}
