package com.OneSoft.for1_IndexArray;

public class ReverseString {
	
	public static void main(String[] args) {
		String name = "RaJarAm", reverse = "";
		for(int i=name.length()-1;i>=0;i--) {
			char ch = name.charAt(i);
			reverse = reverse+ch;
		}
		System.out.println(reverse);
	}

}
