package com.OnSoft.training;

public class PostIncrement {
	
	public static void main(String[] args) {
		int first = 34;
		int second = 0;
		int third = 0;
		for(int i=0;i<first;) {
			second = i++;
		}
		System.out.println("Post Increment - "+second);
		
		for(int i=0;i<first;) {
			third = ++i;
		}
		System.out.println("Pre Increment - "+third);
	}

}
