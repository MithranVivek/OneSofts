package com.OneSoft.day2;

public class UseTv {
	public static void main(String[] args) {
		Tv t = new Tv();
		t.brand = "Sony";
		t.model = "Sony Brevia";
		t.size = 58;
		t.isSmartTv = true;
		t.isRemoteControle = true;
		t.displayType = "LED Display";
		t.resolution = "1800*1250";
		t.price = 95000;

		Tv t1 = new Tv();
		t1.brand = "Onida";
		t1.size = 26;
		t1.isSmartTv = false;
		t1.isRemoteControle = true;
		t1.displayType = "LCD Display";
		t1.price = 12999;

		Tv t2 = new Tv();
		t2.brand = "MI";
		t2.displayType = "LED Display";
		t2.isSmartTv = true;
		t2.isRemoteControle = true;
		t2.size = 42;
		t2.price = 24999;

		System.out.println(t1.brand + "\n" + t1.size + "\n" + t1.isSmartTv + "\n" + t1.isRemoteControle + "\n"
				+ t1.displayType + "\n" + t1.price);
	}

}
