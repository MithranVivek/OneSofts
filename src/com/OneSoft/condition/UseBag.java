package com.OneSoft.condition;

public class UseBag {
	public static void main(String[] args) {
		Bag b1 = new Bag();
		b1.price=350;
		b1.colour="Red";
		b1.noOfZips=4;
		
		Bag b2 = new Bag();
		b2.price=380;
		b2.colour="Green";
		b2.noOfZips=5;
		
		if (b1.price>b2.price) {
			System.out.println(b1.colour);
		}
		else {
			System.out.println(b2.colour);
		}
	}

}
