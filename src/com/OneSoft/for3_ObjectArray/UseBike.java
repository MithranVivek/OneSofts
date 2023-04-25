package com.OneSoft.for3_ObjectArray;

public class UseBike {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.registerDstrict="TN";
		b1.brand="Enfeld";
		b1.price=180000;
		
		Bike b2 = new Bike();
		b2.registerDstrict="TN";
		b2.brand="Honda";
		b2.price=120000;
		
		Bike b3 = new Bike();
		b3.registerDstrict="KL";
		b3.brand="Hero";
		b3.price=95000;
		
		Bike b4 = new Bike();
		b4.registerDstrict="TN";
		b4.brand="Duke";
		b4.price=250000;
		
		Bike b5 = new Bike();
		b5.registerDstrict="MH";
		b5.brand="BMW";
		b5.price=1150000;
		
		Bike b6 = new Bike();
		b6.registerDstrict="TN";
		b6.brand="Susuki";
		b6.price=120000;
		
		Bike[] bikes = {b1,b2,b3,b4,b5,b6};
		for(Bike x : bikes) {
			if(x.registerDstrict.equals("TN")) {
				System.out.println("Bikes Registered TN Region : \n"+x.brand+", "+x.price);
			}
		}

	}

}
