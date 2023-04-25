package com.OneSoft.for2_PrimitiveArray;

public class FruitNames {
	
	public static void main(String[] args) {
String[] fruits = {"Apple","Mango","Pineapple","Lemon","Strawberry","Cherris"};
		
		for(int i=0;i<fruits.length/2;i++) {
			System.out.println(fruits[i]);
		}
		
		System.out.println();
		
		for(int i=fruits.length/2-1;i>=0;i--) {
			System.out.println(fruits[i]);
		}
		
		System.out.println();
		
		for(int i=fruits.length/2;i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}
		
		System.out.println();
		
		for(int i=fruits.length-1;i>=fruits.length/2;i--) {
			System.out.println(fruits[i]);
		}
		
		
	}

}
