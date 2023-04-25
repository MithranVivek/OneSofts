package com.OneSoft.collections3_Streams;

public class Employee {
	private String name;
	private int empID;
	private int salary;
	private String gender;
	
	public Employee(String name, int empID, int salary, String gender) {
		super();
		this.name = name;
		this.empID = empID;
		this.salary = salary;
		this.gender = gender;
		
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empID=" + empID + ", salary=" + salary + ", gender=" + gender
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
