package com.OneSoft.oops2_Inheritance;

public class UseVheicle_HierarchicalInheritance {

	public static void main(String[] args) {
		Cars c = new Cars();
		c.brand = "Hundai";
		c.color = "Red";
		c.model = "i20";
		c.isPetrol = true;
		c.isSpareWheel = true;
		c.isSunSheld = true;
		c.price = 120000;
		c.seatCapacity = 4;
		System.out.println(c.brand+" "+c.model+" "+c.color+" "+c.price+" "+c.isSpareWheel+" "+c.seatCapacity);
		
		Bicycles b = new Bicycles();
		b.brand = "Herculas";
		b.model = "spectal";
		b.price = 35000;
		b.color = "Blue";
		b.isWithGear = true;
		b.noOfGear = 5;
		b.isSports = true;
		
		System.out.println(b.brand+" "+b.model+" "+b.price+" "+b.color+" "+b.isWithGear+" "+b.noOfGear+" "+b.isSports+" "+b.isPetrol);
				


	}

}
