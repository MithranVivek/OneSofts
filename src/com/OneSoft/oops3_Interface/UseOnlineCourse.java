package com.OneSoft.oops3_Interface;

public class UseOnlineCourse {

	public static void main(String[] args) {
		OnlineCourse o = new OnlineCourse();
		System.out.println(o.courseId(23));
		System.out.println(o.courseURL("https:\\www.Onesofts.com"));
		System.out.println(o.courseIs30days(false));
		System.out.println(o.trainerName("Nisanthi"));
		o.courseNameWithFees("java");

	}

}
