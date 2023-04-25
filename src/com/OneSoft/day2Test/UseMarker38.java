package com.OneSoft.day2Test;

public class UseMarker38 {

	public static void main(String[] args) {
		Marker38 m = new Marker38();

		m.price = 20;
		m.colour = "Black";
		m.weight = 20;
		m.isQuality = true;

		System.out.println(m.price + "\n" + m.colour + "\n" + m.weight + "\n" + m.isQuality + "\n");

		Marker38 m1 = new Marker38();

		m1.price = 70;
		m1.colour = "Red";
		m1.weight = 40;
		m1.isQuality = true;

		System.out.println(m1.price + "\n" + m1.colour + "\n" + m1.weight + "\n" + m1.isQuality + "\n");

		Marker38 m2 = new Marker38();

		m2.price = 60;
		m2.colour = "Green";
		m2.weight = 40;
		m2.isQuality = true;

		System.out.println(m2.price + "\n" + m2.colour + "\n" + m2.weight + "\n" + m2.isQuality);

	}

}
