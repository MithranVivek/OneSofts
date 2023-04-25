package com.OneSoft.for1_IndexArray;

public class SecondHalfString {
	
	public static void main(String[] args) {
		String name = "MATHEMATICAL";
		for(int i=name.length()/2;i<name.length();i++) {
			System.out.println(name.charAt(i));
		}
	}

}
