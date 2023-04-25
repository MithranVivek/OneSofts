package com.OneSoft.oops3_Interface;

public class OnlineCourse implements Course {

	public int courseId(int id) {
		return id;
	}

	public String courseURL(String urlLink) {
		return urlLink;
	}

	public boolean courseIs30days(boolean is30days) {
		return is30days;
	}
	
	public String trainerName(String name) {
		return name;
	}
	
	public void courseNameWithFees(String courseName) {
		if(courseName.equalsIgnoreCase("Java")) {
			System.out.println("Course Name is "+courseName+", Fees is 20000");
		}
		else if(courseName.equalsIgnoreCase("Phythan")) {
			System.out.println("Course Name is "+courseName+", Fees is 13000");
		}
		else if(courseName.equalsIgnoreCase("SQl")) {
			System.out.println("Course Name is "+courseName+", Fees is 18000");
		}
		else if(courseName.equalsIgnoreCase("Haking")) {
			System.out.println("Course Name is "+courseName+", Fees is 22000");
		}
		else {
			System.out.println("No Course Available");
		}
	}
	

}
