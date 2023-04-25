package com.OneSoft.oops3_Interface;

public class CubBank implements Bank {

	public long accNum(long acc) {
		return acc;
	}

	public int pinNum(int pin) {
		return pin;
	}

	public float rateOfInterest(int amt) {
		return amt * 5 / 100;
	}

}
