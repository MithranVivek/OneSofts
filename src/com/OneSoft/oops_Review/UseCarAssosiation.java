package com.OneSoft.oops_Review;

public class UseCarAssosiation {

	public static void main(String[] args) {

		Engine engine = new Engine(1500, "Petrol");
		Tyre fl = new Tyre(125, "Square");
		Tyre fr = new Tyre(125, "cross");
		Tyre rl = new Tyre(150, "Hexogon");
		Tyre rr = new Tyre(150, "dimond");
		Tyre[] ts = { fl, fr, rl, rr };

		Car cars = new Car("Ecosport", "Blue", engine, ts);

		//System.out.println(cars);
		
		Vehicle v = new Car("Endevore", "Black", engine, ts);
		
		
		System.out.println("Brand = "+v.brand("Ford")+"\n"+"Price = "+v.price(12000000)+cars);
		
		
		

	}

}
