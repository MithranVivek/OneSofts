package com.OnSoft.training;

public class UseCourseFees {
	
	public int javaCourseFeeStudent1(int fee) {
		return fee;
	}
	
	public static void main(String[] args) {
		
		UseCourseFees ucf = new UseCourseFees();
		
		CourseFees cf = ucf :: javaCourseFeeStudent1;
		System.out.println(cf.javaCourseFee(70000));
		
	}

}
