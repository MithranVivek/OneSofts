package com.OneSoft.function;

public class VoidMethod {
	public void add() {
		int a = 10;
		int b = 12;
		boolean compare = a>b;
		System.out.println(compare);
	}
	
	public void sub(int a , String b) {
		System.out.println(a+"-"+b);
	}
	
	public static void main(String[] args) {
		VoidMethod v = new VoidMethod();
		v.add();
		v.sub(31, "VIVEKBABU");
		v.sub(28, "Vikram");
		v.sub(0, null);
	}

}
