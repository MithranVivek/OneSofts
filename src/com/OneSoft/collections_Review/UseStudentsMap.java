package com.OneSoft.collections_Review;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class UseStudentsMap {

	public static void main(String[] args) {
		Students s1 = (new Students(1, "Ariya", 12, "Male", 6, 'A'));
		Students s2 = (new Students(2, "Abirami", 13, "Female", 7, 'B'));
		Students s3 = (new Students(34, "Balaji", 10, "Male", 5, 'C'));
		Students s4 = (new Students(12, "Bhavana", 15, "female", 10, 'A'));
		Students s5 = (new Students(65, "Chithra", 16, "female", 12, 'B'));
		Students s6 = (new Students(86, "Chandran", 13, "Male", 10, 'C'));
		Students s7 = (new Students(25, "Devika", 8, "female", 4, 'B'));
		Students s8 = (new Students(75, "Deepan", 7, "male", 2, 'C'));
		Students s9 = (new Students(22, "Elavarasi", 6, "female", 1, 'A'));
		Students s10 = (new Students(19, "Faruke", 9, "male", 4, 'A'));
		HashMap<Integer, Students> std = new HashMap<>();
		std.put(s1.getId(), s1);
		std.put(s2.getId(), s2);
		std.put(s3.getId(), s3);
		std.put(s4.getId(), s4);
		std.put(s5.getId(), s5);
		std.put(s6.getId(), s6);
		std.put(s7.getId(), s7);
		std.put(s8.getId(), s8);
		std.put(s9.getId(), s1);
		std.put(s10.getId(), s1);
		
		std.forEach((x,y)-> System.out.println(x+"="+y));
		
		List<String> list = std.values().stream().map(x->x.getName()).collect(Collectors.toList());
		list.forEach(x->System.out.println(x));
		
	List<Integer> list2 = std.values().stream().map(x->x.getStd()).distinct().collect(Collectors.toList());
		System.out.println(list2);
		
		

	}

}
