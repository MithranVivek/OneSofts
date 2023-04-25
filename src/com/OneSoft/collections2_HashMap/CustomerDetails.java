package com.OneSoft.collections2_HashMap;

public class CustomerDetails {
	
	private String name;
	private int age;
	private int amountAvailable;
	private long aadhaarNo;
	private String gender;
	public CustomerDetails(String name, int age, int amountAvailable, long aadhaarNo, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.amountAvailable = amountAvailable;
		this.aadhaarNo = aadhaarNo;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", amountAvailable=" + amountAvailable
				+ ", aadhaarNo=" + aadhaarNo + ", gender=" + gender ;
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
	public int getAmountAvailable() {
		return amountAvailable;
	}
	public void setAmountAvailable(int amountAvailable) {
		this.amountAvailable = amountAvailable;
	}
	public long getAadhaarNo() {
		return aadhaarNo;
	}
	public void setAadhaarNo(long aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
