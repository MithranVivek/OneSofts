package com.OneSoft.oops3_Interface;

public class UseCubBank {

	public static void main(String[] args) {
		CubBank c = new CubBank();
		System.out.println(c.accNum(1212345678l));
		System.out.println(c.pinNum(2345));
		System.out.println(c.rateOfInterest(205000));

	}

}
