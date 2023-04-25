package com.OneSoft.LMSIntro;

public class UseWatch {

	public static void main(String[] args) {
		String[] a = args[0].split(",");
		Watch w = new Watch();
		w.brand = a[0];
		w.price = Integer.parseInt(a[1]);
		w.isDigital = Boolean.parseBoolean(a[2]);
		
		System.out.println("Brand = "+w.brand+"\nPrice = "+w.price+"\nDigital = "+w.isDigital);
		
		String[] b = args[1].split(",");
		Watch w1 = new Watch();
		w1.brand = b[0];
		w1.price = Integer.parseInt(b[1]);
		w1.isDigital = Boolean.parseBoolean(b[2]);
		
		System.out.println("Brand = "+w1.brand+"\nPrice = "+w1.price+"\nDigital = "+w1.isDigital);
	}

}
