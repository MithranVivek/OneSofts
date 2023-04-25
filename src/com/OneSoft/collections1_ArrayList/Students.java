package com.OneSoft.collections1_ArrayList;

public class Students {
	
	private int id;
	private String name;
	private int age;
	private String gender;
	private String degree;
	
	public Students(int id, String name, int age, String gender, String degree) {
//		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", degree=" + degree
				+ "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	

}
