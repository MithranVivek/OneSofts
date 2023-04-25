package com.OneSoft.oops2_Inheritance;

public class UseAdder {

	public static void main(String[] args) {
		Adder a = new Adder();
		System.out.println(a.addThis(1234, 56, 678)+"\n"+
							a.addThis('A', 'a')+"\n"+
							a.addThis(12334758l, 987854333l)+"\n"+
							a.addThis(1234.567f, 366534.746f)+"\n"+
							a.addThis("vivek", "babu"));
		

	}

}

class Adder {
	public int addThis(int a, int b,int c) {
		return a+b+c;
	}
	
	public String addThis(char a, char b) {
		return a+""+b;
	}
	
	public long addThis(long a, long b) {
		return a+b;
	}
	
	public float addThis(float a, float b) {
		return a+b;
	}
	
	public String addThis(String a, String b) {
		return a.concat(b);
	}
}
