package com.OneSoft.for3_ObjectArray;

public class UseMobile {

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.brand="Realmi";
		m1.color="Blue";
		m1.price=12000;
		
		Mobile m2 = new Mobile();
		m2.brand="Redmi";
		m2.color="Green";
		m2.price=11500;
		
		Mobile m3 = new Mobile();
		m3.brand="Samsung";
		m3.color="Gold";
		m3.price=13500;
		
		Mobile m4 = new Mobile();
		m4.brand="Motorola";
		m4.color="Ash";
		m4.price=9500;
		
		Mobile m5 = new Mobile();
		m5.brand="Sony";
		m5.color="Black";
		m5.price=25000;
		
		Mobile m6 = new Mobile();
		m6.brand="Oppo";
		m6.color="Red";
		m6.price=14000;
		
		Mobile m7 = new Mobile();
		m7.brand="HTC";
		m7.color="white";
		m7.price=22000;
		
		Mobile[] mobiles = {m1,m2,m3,m4,m5,m6,m7};
		
		for(int i=0;i<mobiles.length;i++) {
			System.out.println(mobiles[i].brand+", "+mobiles[i].color+", "+mobiles[i].price);
		}
		
		
	}

}
