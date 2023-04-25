package com.OneSoft.collections2_HashMap;

public class Student {
	
	private String name;
	private int id;
	private int std;
	private String grade;
	private int average;
	
	public Student(String name, int id, int std, String grade, int average) {
		super();
		this.name = name;
		this.id = id;
		this.std = std;
		this.grade = grade;
		this.average = average;
	}
	
	
	@Override
	public String toString() {
		return "name=" + name + ", id=" + id + ", std=" + std + ", grade=" + grade + ", average=" + average;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	
	

}
