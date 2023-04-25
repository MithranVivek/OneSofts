package com.OneSoft.for1_IndexArray;

public class AverageValue {
	
	public static void main(String[] args) {
		int avg = 0;
		int count = 0;
		for(int i=1;i<20;i++) {
			avg = avg + i;
			count = count+1;
		}
		System.out.println(avg);
		System.out.println(avg/count);
	}

}
