package com.OneSoft.for1_IndexArray;

public class ODD_EVEN {

	public static void main(String[] args) {

		String name = "MATHEMATICAL", rev = "";
		for (int i = name.length() / 2; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
	}

}
