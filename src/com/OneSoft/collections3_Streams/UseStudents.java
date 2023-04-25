package com.OneSoft.collections3_Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class UseStudents {

	public static void main(String[] args) {
		ArrayList<Students> details = new ArrayList<>();
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

//		Using Filter
		
		List<Students> sectionAList = details.stream().filter(x -> x.getSection() == 'A').collect(Collectors.toList());
		long countAsection = sectionAList.stream().count();
		for (Students x : sectionAList) {
			System.out.println(x);
		}
		System.out.println(countAsection);
		System.out.println();

		List<Students> sectionBList = details.stream().filter(x -> x.getSection() == 'B').collect(Collectors.toList());
		long countBsection = sectionBList.stream().count();
		for (Students x : sectionBList) {
			System.out.println(x);
		}
		System.out.println(countBsection);
		System.out.println();

		List<Students> sectionCList = details.stream().filter(x -> x.getSection() == 'C').collect(Collectors.toList());
		long countCsection = sectionCList.stream().count();
		for (Students x : sectionCList) {
			System.out.println(x);
		}
		System.out.println(countCsection);
		System.out.println();

		long countOf6thStd = details.stream().filter(x -> x.getStd() == 6).count();
		System.out.println(countOf6thStd);
		System.out.println();

//		Using Map Stream Method
		
		List<String> maleNames = details.stream().filter(x -> x.getGender().equalsIgnoreCase("male"))
				.map(y -> y.getName()).collect(Collectors.toList());
		for (String x : maleNames) {
			System.out.println(x);
		}
		System.out.println();

		List<Integer> age15Std = details.stream().filter(x -> x.getAge() >= 15).map(y -> y.getStd())
				.collect(Collectors.toList());
		for (Integer x : age15Std) {
			System.out.println(x);
		}
		
//		Using _Map Interface_| and |_Map Stream_ Method
		
		Map<Integer,Students> newList = details.stream().filter(x -> x.getGender().equalsIgnoreCase("male")).collect(Collectors.toMap(e->e.getId(), b->b));
		Set<Entry<Integer,Students>> setList = newList.entrySet();
		for(Entry<Integer,Students> x : setList) {
			System.out.println(x);
		}
		System.out.println();
		
		for(Integer x : newList.keySet()) {
			System.out.println(x+" "+newList.values());
		}
		System.out.println();
		
//		Find Maximum using Stream Method
		
		Students maxAge = details.stream().max(Comparator.comparing(Students::getAge)).get();
		System.out.println(maxAge);
		System.out.println();
		
//		Find Minimum using Stream Method
		
		Students minAge = details.stream().min(Comparator.comparing(Students::getAge)).get();
		System.out.println(minAge);
		System.out.println();
		
//		Set the Limit To the Iteration
		
		List<Students> limit = details.stream().limit(5).collect(Collectors.toList());
		for(Students x : limit) {
		System.out.println(x);
		}
		System.out.println();
		
//		Print The Shorted List Ascending
		
		List<Students> sort = details.stream().sorted(Comparator.comparing(Students::getId)).collect(Collectors.toList());
		for(Students x : sort) {
			System.out.println(x);
		}
		System.out.println();
		
//		After Map Shorted
		
		details.stream().map(x->x.getId()).sorted().forEach(z->System.out.println(z));
		
//		Print The Shorted List Reverse (or) Descending
		
		List<Students> sortRev = details.stream().sorted(Comparator.comparing(Students::getId).reversed()).collect(Collectors.toList());
		for(Students x : sortRev) {
			System.out.println(x);
		}
		System.out.println();

//		Using Distinct Method Find the group of available
		
		List<Integer> distinct = details.stream().map(x->x.getAge()).distinct().collect(Collectors.toList());
		for(Integer x : distinct) {
			System.out.println(x);
		}
		System.out.println();
		
//		Using SummingLong Method
		
		Long sum = details.stream().collect(Collectors.summingLong(z->z.getAge()));
		System.out.println(sum);
		
		Integer sum1 = details.stream().collect(Collectors.summingInt(z->z.getAge()));
		System.out.println(sum1);
		

	}

}
