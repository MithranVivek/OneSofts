package com.OneSoft.collections1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class UseStudents {

	public static void main(String[] args) {
		Students s1 = new Students(1, "Dhinesh", 31, "Male", "Btech");
		Students s2 = new Students(2, "Vivek", 31, "Male", "Btech");
		Students s3 = new Students(3, "Saroja", 26, "Female", "BE");
		Students s4 = new Students(4, "Sundar", 30, "Male", "BE");
		Students s5 = new Students(5, "Gokul", 28, "Male", "Btech");
		Students s6 = new Students(6, "Raji", 27, "Female", "BE");
		
		ArrayList<Students> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		
//		for(Students x : list) {
//			System.out.println(x);	
//		}
//		list.forEach(x->{
//			if(x.getAge()<30) {
//				System.out.println(x);
//			}
//		});
		
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i).getDegree().equals("Btech")) {
//				System.out.println(list.get(i));
//			}
//		}
		
//		ArrayList<Students> maleList = new ArrayList<>();
//		ArrayList<Students> femaleList = new ArrayList<>();
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i).getGender().equalsIgnoreCase("Male")) {
//				maleList.add(list.get(i));
//			}
//			else {
//				femaleList.add(list.get(i));
//			}
//		}
//		System.out.println(maleList);
//		System.out.println(femaleList);
		ArrayList<String> names = new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			names.add(list.get(i).getName());
		}
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		System.out.println();
		
		List<String> gender = new ArrayList<>();
		for(Students x : list) {
			if(x.getGender().equalsIgnoreCase("Female")) {
				gender.add(x.getGender().toUpperCase());
			}
		}
		gender.forEach(x->System.out.println(x));
		
		List<Students> newList = new ArrayList<>();
		
		for(Students x : list) {
			x.setAge(x.getAge()+2);
			newList.add(x);
		}
		newList.forEach(x->System.out.println(x));
		System.out.println();
		
		List<Students> femaleList = new ArrayList<>();
		
		for(Students x : list) {
			if(x.getGender().equalsIgnoreCase("Female")) {
				x.setGender(x.getGender().toUpperCase());
				femaleList.add(x);
			}
		}
		femaleList.forEach(x-> System.out.println(x));

	}

}
