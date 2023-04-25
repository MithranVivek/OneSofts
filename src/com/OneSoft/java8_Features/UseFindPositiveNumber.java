package com.OneSoft.java8_Features;

public class UseFindPositiveNumber {

	public static void main(String[] args) {
		FindPositiveNumber pos = (x)-> {
			for(int i=0;i<x.length;i++) {
			if(x[i]>0) {
				System.out.println(x[i]);
			}
			}
			
		};
		int[] poss = {12,34,-24,56,-23,-43,11,-6};
		pos.findPosNum(poss);

	}

}
