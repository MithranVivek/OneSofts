package com.OneSoft.java8_Features;

public class Methods {
	
	public static int findMax(int[] nums) {
		int max = 0;
		for(Integer x : nums) {
		if(x>=max) {
			max = x;
		}
		}
		return max;
	}
//-------------------------------------------------------------------	
	public static int findPositiveNumbers(int[] nums) {
	for(int i=0;i<nums.length;i++) {
		if(nums[i]>0) {
			return (nums[i]);
		}
		}
	return 0;
	}
//----------------------------------------------------------------------
	public String findMinString(String[] names) {
		int min = names[0].length();
		String temp = null;
		for(String x : names) {
			int len = x.length();
			if(len<=min) {
				min = len;
				temp = x;
			}
		}
		return temp;
		
	}

}
