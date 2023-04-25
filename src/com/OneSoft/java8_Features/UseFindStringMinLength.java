package com.OneSoft.java8_Features;

public class UseFindStringMinLength {

	public static void main(String[] args) {
		Methods m = new Methods();
		String[] name = {"Sun", "Moon", "River", "Ocean", "Continent"};
		FindStringMinLength min = m :: findMinString;
		System.out.println(min.findMinLengthString(name));

	}

}
