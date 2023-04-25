package com.OneSoft.day2;

public class UseBike {
	public static void main(String[] args) {
		Bike b=new Bike();
		b.brand="Enfiled";
		b.price=220000;
		b.colour="Blue";
		b.isAlloyWheel=false;
		b.engineCC=350.00f;
		b.batteryType='c';
		
		System.out.println(b.brand+"\n"+b.price+"\n"+b.colour+"\n"+
					b.isAlloyWheel+"\n"+b.engineCC+"\n"+b.batteryType);
	}
}
