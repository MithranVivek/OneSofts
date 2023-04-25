package com.OneSoft.for2_PrimitiveArray;

public class LMSIds {
	
	public static void main(String[] args) {
		int[] ids = new int[4];
		ids[0] = 1131;
		ids[1] = 1130;
		ids[2] = 1129;
		ids[3] = 1128;
		
		for(int i=0;i<ids.length;i++) {
			System.out.println(ids[i]);
		}
		System.out.println();
		for(int i=ids.length-1;i>=0;i--) {
			System.out.println(ids[i]);
		}
		System.out.println();
		for(int i=0;i<ids.length;i++) {
			if(ids[i]%2!=0) {
				System.out.println(ids[i]);
			}
		}
	}

}
