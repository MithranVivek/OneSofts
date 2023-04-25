package com.OneSoft.for1_IndexArray;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int count = 0, value = 1013;
		boolean prime = true;
		
		for(int i=1;i<value;i++) {
			if(value%i==0) {
				count = count+1;
				
			} 
		}
			if(count<=2) {
				System.out.println("Prime Number");
			}
			else {
				System.out.println("Not Prime Number");
			}
			
			for(int i=2;i<value;i++) {
				if(value%i==0) {
					prime = false;
					
				} 
			}
				if(prime==true) {
					System.out.println(value+" is Prime Number");
				}
				else {
					System.out.println(value+" is Not Prime Number");
				}
		}
	
}
