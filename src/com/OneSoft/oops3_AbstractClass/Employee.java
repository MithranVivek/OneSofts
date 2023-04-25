package com.OneSoft.oops3_AbstractClass;

public abstract class Employee {
	
	public int empId(int id) {
		return id;
	}
	
	public String empName(String name) {
		return name;
	}
	
	public abstract int empSalary(int salary);

}
