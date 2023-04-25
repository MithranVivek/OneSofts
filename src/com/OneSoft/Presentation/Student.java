package com.OneSoft.Presentation;

public class Student {
	private String name;
	private int age;
	protected String mark;
	protected String grade;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Name = "+name+", Age = "+age;
	}

}
