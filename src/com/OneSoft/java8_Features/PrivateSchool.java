package com.OneSoft.java8_Features;

public class PrivateSchool implements School{

	@Override
	public String schoolName(String name) {
		return name;
	}
	
	@Override
	public int govFees(int fees) {
		return (fees)+8000;
	}
	

}
