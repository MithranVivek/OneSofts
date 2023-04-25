package com.OneSoft.Presentation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import com.OneSoft.collections3_Streams.Students;

public class UseStudents {

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
		
		ArrayList<Students> details = new ArrayList<>();
		details.add(s1);
		details.add(s2);
		details.add(s3);
		details.add(s4);
		details.add(s5);
		details.add(s6);
		details.add(s7);
		details.add(s8);
		details.add(s9);
		details.add(s10);
		
		
		
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
		
		Map<Integer, Students> usemap = details.stream().collect(Collectors.toMap(e->e.getId(), d->d));
		usemap.forEach((x,y)->System.out.println(x+" "+y));
		System.out.println();
		
		Map<Integer, Students> mapl = details.stream().filter(x->x.getGender().equalsIgnoreCase("male")).collect(Collectors.toMap(c->c.getId(), v->v));
		mapl.forEach((x,y)->System.out.println(x+" "+y));
		System.out.println();
		
		Set<Students> useset = details.stream().collect(Collectors.toSet());
		useset.forEach(z->System.out.println(z));
		System.out.println();
		
		Set<Character> setmethod = details.stream().map(x->x.getSection()).collect(Collectors.toSet());
		System.out.println(setmethod);
		System.out.println();
		
		Set<Students> det = new HashSet<>();
		for(Students x : details) {
			det.add(x);
		}
		det.forEach(x->System.out.println(x));
		System.out.println();
		
		Set<Students> s = details.stream().filter(x->x.getAge()>10).collect(Collectors.toSet());
		s.forEach(x->System.out.println(x));

		
			}

}
