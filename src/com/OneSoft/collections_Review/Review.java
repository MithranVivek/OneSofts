package com.OneSoft.collections_Review;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Review {

	public static void main(String[] args) {
		
//		public interface List<E> extends Collection<E> { List is a collection
		ArrayList<Integer> li = new ArrayList<>();
		
		li.add(11);
		li.add(12);
		li.add(14);
		li.add(15);
		li.add(16);
		li.add(2,13);
//		li.add(7,33);
		
		System.out.println(li);
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(11);
		ll.add(12);
		ll.add(14);
		ll.add(15);
		ll.add(16);
		ll.add(2,13);
//		ll.add(7,33);
		
		System.out.println(ll);
		
		
//		public interface Map<K, V> { map is not a collection
		Map<Integer, String> name = new HashMap<>();
		
		name.put(101, "vivek");
		name.put(226, "dhinesh");
		name.put(14, "sajin");
		name.put(15, "sundar");
		name.put(16, "nithi");
		for(Integer x : name.keySet()) {
			System.out.println(x.byteValue());
		}
//		System.out.println(name.keySet().hashCode());
		

	}

}
