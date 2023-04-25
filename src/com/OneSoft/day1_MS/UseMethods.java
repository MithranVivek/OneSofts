package com.OneSoft.day1_MS;

import java.util.ArrayList;

import com.OneSoft.collections1_ArrayList.Car;

public class UseMethods {

	public static void main(String[] args) {
		Methods nm = new Methods();
		
		nm.findFibbinosisSeries(8).forEach(x -> System.out.println(x));
		
		System.out.println(nm.findEvenNumbers(100));
		
		System.out.println(nm.findOddNumbers(100));
		
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(new Car("Ford", 2200000, "Blue", "Endevour"));
		cars.add(new Car("Hundai", 1200000, "White", "i10"));
		cars.add(new Car("Honda", 400000, "Black", "buzz"));
		cars.add(new Car("Maruthi", 1400000, "White", "swift"));
		cars.add(new Car("Nissan", 1700000, "Red", "sunny"));
		
		nm.findCarColor("White", cars ).forEach(x -> System.out.println(x));
		
		

	}

}
