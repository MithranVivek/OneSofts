package com.OneSoft.day1_MS;

import java.util.ArrayList;
import java.util.List;

import com.OneSoft.collections1_ArrayList.Car;


public class Methods {
	
	public List<Integer> findFibbinosisSeries(int num) {
		List<Integer> fibb = new ArrayList<>();
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 0; i < num; i++) {
			fibb.add(a);
			c = a + b;
			a = b;
			b = c;
		}
		return fibb;
	}
	
	public List<Integer> findEvenNumbers(int num){
		ArrayList<Integer> even = new ArrayList<>();

		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				even.add(i);
			}
		}

		return even;
	}
	
	public List<Integer> findOddNumbers(int num){
		ArrayList<Integer> odd = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0) {
				odd.add(i);
			}
		}
		return odd;
	}

	public List<Car> findCarColor(String color, List<Car> cars) {
		
		List<Car> colorList = new ArrayList<>();
		
		for(Car x : cars) {
			if(x.getColour().equalsIgnoreCase(color)) {
				colorList.add(x);
			}
		}
		return colorList;
	}
	
}
