package com.OneSoft.collections1_ArrayList;

import java.util.ArrayList;

public class UseCar {

	public static void main(String[] args) {
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(new Car("Ford", 2200000, "Blue", "Endevour"));
		cars.add(new Car("Hundai", 1200000, "White", "i10"));
		cars.add(new Car("Honda", 400000, "Black", "buzz"));
		cars.add(new Car("Maruthi", 1400000, "White", "swift"));
		cars.add(new Car("Nissan", 1700000, "Red", "sunny"));
		
		ArrayList<String> brands = new ArrayList<>();
		
		
		
		cars.forEach(x->{
			brands.add(x.getBrand());
		});
		
//		cars.forEach(x -> System.out.println(x+"\n"));
		
		for(String x : brands) {
			System.out.println(x);
		}
		
		System.out.println();
		for(int i=0;i<cars.size();i++) {
			System.out.println(cars.get(i).getModel());
		}

	}

}
