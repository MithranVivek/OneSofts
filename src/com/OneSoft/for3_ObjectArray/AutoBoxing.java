package com.OneSoft.for3_ObjectArray;

public class AutoBoxing {

	public static void main(String[] args) {
		int[] nums = {23,24,25,26,27,28};
		boolean[] isTrue = {true,false,true,false,false};
		int max = 0, min = nums[0];
		for(Integer x : nums) {
			
			System.out.println(x);
			
			if(x>max) {
				max=x;
			}
			if(x<min) {
				min=x;
			}
		}
		System.out.println("\n"+max+"\n"+min);
		
		for(Boolean x : isTrue) {
			System.out.println(x);
		}

	}

}
