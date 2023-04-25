package com.OneSoft.for2_PrimitiveArray;

public class CountryNames {

	public static void main(String[] args) {
		String[] names = new String[8];
		names[0] = "India";
		names[1] = "China";
		names[2] = "Jappan";
		names[3] = "America";
		names[4] = "Greenland";
		names[5] = "Ireland";
		names[6] = "Arabia";
		names[7] = "Africa";

		for (int i = 0; i < names.length; i++) {
			if (names[i].endsWith("a")) {
				System.out.println(names[i]);
			}
		}
		System.out.println();

		for (int i = 0; i < names.length; i++) {
			if (names[i].contains("a") || names[i].contains("e") || names[i].contains("i") || names[i].contains("o")
					|| names[i].contains("u") || names[i].contains("A") || names[i].contains("E")
					|| names[i].contains("I") || names[i].contains("O") || names[i].contains("U")) {
				System.out.println(names[i] + " is Contains vowels");
			}
		}
		System.out.println();
		
		for (int i = 0; i < names.length; i++) {
			if (i%2!=0) {
				System.out.println(names[i]);
			}
		}
		System.out.println();
		
		for (int i = 0; i < names.length; i++) {
			if (!names[i].startsWith("I")) {
				System.out.println(names[i]);
			}
		}
		System.out.println();
		
		for (int i = 0; i < names.length; i++) {
			if (names[i].length()>6) {
				System.out.println(names[i]);
			}
		}
		System.out.println();
		
	}

}
