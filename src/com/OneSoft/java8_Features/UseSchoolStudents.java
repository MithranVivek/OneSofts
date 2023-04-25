package com.OneSoft.java8_Features;

import java.util.ArrayList;
import java.util.List;

public class UseSchoolStudents {

	public static void main(String[] args) {
		SchoolStudents s1 = new SchoolStudents(1, "Dhinesh", 31, "Male", "Btech");
		SchoolStudents s2 = new SchoolStudents(2, "Vivek", 31, "Male", "Btech");
		SchoolStudents s3 = new SchoolStudents(3, "Saroja", 26, "Female", "BE");
		SchoolStudents s4 = new SchoolStudents(4, "Sundar", 30, "Male", "BE");
		SchoolStudents s5 = new SchoolStudents(5, "Gokul", 28, "Male", "Btech");
		SchoolStudents s6 = new SchoolStudents(6, "Raji", 27, "Female", "BE");

		ArrayList<SchoolStudents> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);

		ArrayList<SchoolStudents> age30List = new ArrayList<>();

		Students st = ab -> {
			for (SchoolStudents x : ab) {
				if (x.getAge() >= 30) {
					age30List.add(x);
				}
			}
		};
		st.findAgeOfStudents(list);
		age30List.forEach(x -> System.out.println(x));

	}

}
