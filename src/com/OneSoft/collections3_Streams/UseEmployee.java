package com.OneSoft.collections3_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {

	public static void main(String[] args) {
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Vivekbabu", 1131, 22000, "Male"));
		emps.add(new Employee("Dhinesh", 1130, 22000, "Male"));
		emps.add(new Employee("sajin", 1126, 24000, "Male"));
		emps.add(new Employee("Revathi", 1112, 24000, "Female"));
		emps.add(new Employee("Priya", 1103, 26000, "Female"));
		emps.add(new Employee("Ravi", 1002, 28000, "Male"));
		emps.add(new Employee("Dhanush", 1136, 21000, "Male"));
		emps.add(new Employee("Vikram", 1163, 16000, "Male"));
		emps.add(new Employee("Jeniliya", 1158, 16000, "Female"));
		emps.add(new Employee("Surya", 931, 32000, "Male"));
		
		List<Employee> femaleList = emps.stream().filter(x->x.getGender().equalsIgnoreCase("female")).collect(Collectors.toList());
		for(Employee x : femaleList) {
			System.out.println(x);
		}
		System.out.println();
		
		List<Employee> highSalary = emps.stream().filter(x->(x.getSalary()>=25000 && x.getSalary()<=40000)).collect(Collectors.toList());
		for(Employee x : highSalary) {
			System.out.println(x);
		}
		System.out.println();
		
		List<String> empNames = emps.stream().map(x->x.getName()).collect(Collectors.toList());
		for(String x : empNames) {
			System.out.println(x);
		}
		System.out.println();
		
		List<Integer> highSalaryEmpIDs = emps.stream().filter(x -> x.getSalary()>25000).map(y -> y.getEmpID()).collect(Collectors.toList());
		for(Integer x : highSalaryEmpIDs) {
			System.out.println(x);
		}

	}

}
