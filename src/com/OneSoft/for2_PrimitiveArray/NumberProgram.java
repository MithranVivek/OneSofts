package com.OneSoft.for2_PrimitiveArray;

public class NumberProgram {
	
	public static void main(String[] args) {
		int[] nums = {-2,26,18,-15,60,-3};
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<0) {
				System.out.println(nums[i]);
			}
		}
		System.out.println();
		
		int add =0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0) {
				add = add + nums[i];
			}
		}
		System.out.println(add);
		System.out.println();
		
		int count = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<0) {
				count = count+1;
			}
		}
		System.out.println("Count of Negative numbers "+count);
	}

}
