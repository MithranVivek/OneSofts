package com.OneSoft.for1_IndexArray;

public class BreakSkipProgram {
	
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i%4==0) {
				break;
			}
			else {
				System.out.println(i);
			}
		}
	}

}
