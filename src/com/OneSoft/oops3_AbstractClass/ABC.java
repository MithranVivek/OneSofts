package com.OneSoft.oops3_AbstractClass;

public class ABC implements A,B,C {
	
	private int age;

	@Override
	public String voterElgible() {
		if(age>=18) {
		return "Eligible to vote";
		}
		else {
			return "Not-Eligible to vote";
		}
	}

	@Override
	public int votedYears(int year) {
		return age-18;
	}

	@Override
	public String distric(String district) {
		return district;
	}

	@Override
	public int pinCode(int pinCode) {
		return pinCode;
	}

	@Override
	public String name(String name) {
		return name;
	}

	@Override
	public int age(int age) {
		this.age = age;
		return age;
	}

}
