package com.OneSoft.functionInterface_Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.OneSoft.java8_Features.SchoolStudents;

public class UseType4_PredicateInterface {

	public static void main(String[] args) {
		Predicate<Integer> max = (x) -> {
			if(x>2) {
				return true;
			}
			else {
				return false;
			}
		};
		
		System.out.println(max.test(12));
		
		
			List<SchoolStudents> list = new ArrayList<>();
			list.add(new SchoolStudents(1, "Dhinesh", 31, "Male", "Btech"));
			list.add(new SchoolStudents(3, "Saroja", 26, "Female", "BE"));
			list.add(new SchoolStudents(2, "Vivek", 31, "Male", "Btech"));
			list.add(new SchoolStudents(4, "Sundar", 30, "Male", "BE"));
			list.add(new SchoolStudents(5, "Gokul", 28, "Male", "Btech"));
			list.add(new SchoolStudents(6, "Raji", 27, "Female", "BE"));
			
			List<SchoolStudents> collect = list.stream().filter(y->y.getAge()>28).collect(Collectors.toList());
			collect.forEach(x -> System.out.println(x));

	}

}
