package com.OneSoft.Presentation;

public class Students {
	
	private int id;
	private String name;
	private int age;
	private String gender;
	private int std;
	private char section;
	public Students(int id, String name, int age, String gender, int std, char section) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.std = std;
		this.section = section;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", std=" + std
				+ ", section=" + section + "]";
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
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	
	

}
