package com.OneSoft.collections2_HashMap;

import java.util.HashMap;

public class UseStudent {

	public static void main(String[] args) {
		Student s1 = new Student("Vivek", 1131, 10, "C+", 65);
		Student s2 = new Student("Dhinesh", 1130, 10, "A", 85);
		Student s3 = new Student("Sajin", 1128, 11, "A+", 95);
		Student s4 = new Student("Gokul", 1121, 12, "A+", 95);
		Student s5 = new Student("Sundar", 1126, 11, "B+", 75);
		Student s6 = new Student("Rajesh", 1122, 12, "A+", 90);

		HashMap<Integer, Student> lms = new HashMap<>();
		lms.put(s1.getId(), s1);
		lms.put(s2.getId(), s2);
		lms.put(s3.getId(), s3);
		lms.put(s4.getId(), s4);
		lms.put(s5.getId(), s5);
		lms.put(s6.getId(), s6);

//		lms.forEach((x, y) -> System.out.println(x + " " + y));
//
//		for (Integer x : lms.keySet()) {
//			if (lms.get(x).getName().startsWith("S")) {
//				System.out.println(lms.get(x));
//			}
//		}
//
//		int min = s1.getId();
//		String name = null;
//		for (Integer x : lms.keySet()) {
//			if (x < min) {
//				min = x;
//				name = lms.get(x).getName();
//			}
//		}
//		System.out.println(name);
//
//		int max = 0;
//		String grade = null;
//		for (Student s : lms.values()) {
//			if (s.getAverage() > max) {
//				max = s.getAverage();
//				grade = s.getGrade();
//			}
//		}
//		System.out.println(grade);
//
//		lms.values().forEach(y -> {
//			if (y.getStd() == 10) {
//				System.out.println(y);
//
//			}
//		});
		
		HashMap<Integer, Student> names = new HashMap<>();
		
		lms.forEach((x,y) -> {
			if(y.getName().length()>5) {
				names.put(x, y);
			}
		});
		
		names.forEach((x,y)->System.out.println(x+" "+y));
		
		for(Integer x : lms.keySet()) {
			if(lms.get(x).getName().length()>5) {
				names.put(x, lms.get(x));
			}
		}
		
		System.out.println("\n"+names);

	}

}
