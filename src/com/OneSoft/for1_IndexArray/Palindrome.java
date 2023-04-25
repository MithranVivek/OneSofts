package com.OneSoft.for1_IndexArray;

public class Palindrome {
	
	public static void main(String[] args) {
		String name = "madam", reverse="";
		
		for(int i=name.length()-1;i>=0;i--) {
			char ch = name.charAt(i);
			reverse = reverse+ch;
		}
		if(name.equals(reverse)) {
			System.out.println("Given Name is Palindrome");
		}
		else {
			System.out.println("Given Name is Not Palindrome");
		}
	}

}
