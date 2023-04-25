package com.OneSoft.for1_IndexArray;

public class PrintUpperCase {
	
	public static void main(String[] args) {
		String name = "RaJarAm";
		int count = 0;
		
		for(int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			if(ch>='A' && ch<='Z') {
				System.out.println(name.charAt(i));
			}
			else {
				count = count+1;
			}
		}
		System.out.println("LowerCase Count = "+count);
	}

}
