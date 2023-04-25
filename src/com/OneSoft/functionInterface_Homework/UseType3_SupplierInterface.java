package com.OneSoft.functionInterface_Homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import com.OneSoft.java8_Features.SchoolStudents;

public class UseType3_SupplierInterface {

	public static void main(String[] args) {
		
		Supplier<LocalDate> date = ()-> LocalDate.now();
		System.out.println(date.get());

//-------------------------------------------------------------------------
//		Supplier Using Object 
//-------------------------------------------------------------------------
		
		Supplier<List<SchoolStudents>> nameList = () -> {
		List<SchoolStudents> list = new ArrayList<>();
		list.add(new SchoolStudents(1, "Dhinesh", 31, "Male", "Btech"));
		list.add(new SchoolStudents(3, "Saroja", 26, "Female", "BE"));
		list.add(new SchoolStudents(2, "Vivek", 31, "Male", "Btech"));
		list.add(new SchoolStudents(4, "Sundar", 30, "Male", "BE"));
		list.add(new SchoolStudents(5, "Gokul", 28, "Male", "Btech"));
		list.add(new SchoolStudents(6, "Raji", 27, "Female", "BE"));
		return list;
		};
		
		for(SchoolStudents x : nameList.get()) {
			System.out.println(x);
		}
		System.out.println();
		
//--------------------------------------------------------------------------------		
//		Supplier Using Object with static Method
//----------------------------------------------------------------------------------		
		
		for(SchoolStudents x : studentList().get()) {
			System.out.println(x);
		}


	}
	
	
	
	
	
	
	
	
	
	
	public static Supplier<List<SchoolStudents>> studentList() {
		Supplier<List<SchoolStudents>> nameList = () -> {
			List<SchoolStudents> list = new ArrayList<>();
			list.add(new SchoolStudents(1, "Dhinesh", 31, "Male", "Btech"));
			list.add(new SchoolStudents(3, "Saroja", 26, "Female", "BE"));
			list.add(new SchoolStudents(2, "Vivek", 31, "Male", "Btech"));
			list.add(new SchoolStudents(4, "Sundar", 30, "Male", "BE"));
			list.add(new SchoolStudents(5, "Gokul", 28, "Male", "Btech"));
			list.add(new SchoolStudents(6, "Raji", 27, "Female", "BE"));
			return list;
			};
			return nameList;
	}
	
}
