package com.OneSoft.for1_IndexArray;

public class StringODDEVEN {
	
	public static void main(String[] args) {
		String name = "vivekbabup";
		
			if(name.length()%2==0) {
				System.out.println(name.substring(name.length()/2-1, name.length()/2+1));
			}
			else {
				System.out.println(name.charAt(name.length()/2));
			}
		}
	

}
