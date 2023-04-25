package com.OneSoft.collections_Review;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.OneSoft.collections3_Streams.Students;

public class UseStudentLinkedList {

	public static void main(String[] args) {
		LinkedList<Students> details = new LinkedList<>();
		
		details.add(new Students(1, "Ariya", 12, "Male", 6, 'A'));
		details.add(new Students(2, "Abirami", 13, "Female", 7, 'B'));
		details.add(new Students(34, "Balaji", 10, "Male", 5, 'C'));
		details.add(new Students(12, "Bhavana", 15, "female", 10, 'A'));
		details.add(new Students(65, "Chithra", 16, "female", 12, 'B'));
		details.add(new Students(86, "Chandran", 13, "Male", 10, 'C'));
		details.add(new Students(25, "Devika", 8, "female", 4, 'B'));
		details.add(new Students(75, "Deepan", 7, "male", 2, 'C'));
		details.add(new Students(22, "Elavarasi", 6, "female", 1, 'A'));
		details.add(new Students(19, "Faruke", 9, "male", 4, 'A'));
		
		for(Students x : details) {
		System.out.println(x);
		}
		
		List<String> collect = details.stream().map(x->x.getGender()).distinct().collect(Collectors.toList());
		System.out.println(collect);
		
		Map<Integer, Students> femaleMap = details.stream().filter(x->x.getGender().equalsIgnoreCase("female")).collect(Collectors.toMap(a->a.getId(), b->b));
		
		femaleMap.forEach((x,y)-> System.out.println(x+"-"+y));

	}

}
