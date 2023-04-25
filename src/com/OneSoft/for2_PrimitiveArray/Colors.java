package com.OneSoft.for2_PrimitiveArray;

public class Colors {
	
	public static void main(String[] args) {
		String[] colors = {"ash","red","blue","green","darkpink","yellow"};
		
		for(int i=0;i<colors.length;i++) {
			System.out.println(colors[i]);
		}
		
		System.out.println();
		
		for(int i=colors.length-1;i>=0;i--) {
			System.out.println(colors[i]);
		}
		
		System.out.println();
		
		for(int i=0;i<colors.length;i++) {
			System.out.println(colors[i].charAt(0));
		}
		
		System.out.println();
		
		for(int i=0;i<colors.length;i++) {
			System.out.println(colors[i].charAt(colors[i].length()-1));
		}
		
		System.out.println();
		
		for(int i=0;i<colors.length;i++) {
			System.out.println(colors[i].charAt(i));
		}
		
	}

}
