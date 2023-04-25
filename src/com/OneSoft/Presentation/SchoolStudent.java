package com.OneSoft.Presentation;

public class SchoolStudent extends Student {

	private String std;
	
	
	public SchoolStudent(String name, int age, String std,String mark) {
		super(name, age);
		super.mark = mark;
		this.std = std;
	}


	@Override
	public String toString() {
		return super.toString()+", Std=" + std +", Mark = "+mark;
	}
	

}
