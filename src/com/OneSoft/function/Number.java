package com.OneSoft.function;

public class Number {
	
	public int printNumber(int[] a) {
//	public int printNumber() {
//		int[] a= {23,56,89,45};
		int max = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max =  a[i];
			}
		}
		return max;
	}
	
	

}
