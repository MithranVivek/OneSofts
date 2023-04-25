package com.OneSoft.for1_IndexArray;

public class StringNumber {
	
	public static void main(String[] args) {
		String s = "r1b2c3e4";
		
		int count = 0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z') {
				count = count+1;
			
			}
			else {
					System.out.println(s.charAt(i));
				
			}
		}
		System.out.println("Character Count is "+count);
	}

}
