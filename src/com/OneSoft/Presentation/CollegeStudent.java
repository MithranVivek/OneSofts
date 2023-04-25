package com.OneSoft.Presentation;

public class CollegeStudent extends Student {
	
	private String dept;
	
	public CollegeStudent(String name, int age, String dept,String grade) {
		super(name, age);
		super.grade = grade;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString()+", Dept=" + dept +", Grade = "+grade;
	}
	

	
	

}
