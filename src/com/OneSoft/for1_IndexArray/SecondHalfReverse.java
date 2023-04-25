package com.OneSoft.for1_IndexArray;

public class SecondHalfReverse {
	
	public static void main(String[] args) {
		String name = "MATHEMATICAL", rev="";
		for(int i=name.length()-1;i>name.length()/2;i--) {
			rev = rev+name.charAt(i);
		}
		System.out.println(rev);
	}

}
