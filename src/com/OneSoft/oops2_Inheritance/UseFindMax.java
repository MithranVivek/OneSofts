package com.OneSoft.oops2_Inheritance;

public class UseFindMax {

	public static void main(String[] args) {
		FindMax f = new FindMax();
		System.out.println(f.findMax()+"\n"+
							f.findMax(23, 24)+"\n"+
							f.findMax("sun", "Moon"));

	}

}

class FindMax {
	public int findMax() {
		return 10;
	}
	public int findMax(int a, int b) {
		if(a>b) {
		return a;
		}
		else {
			return b;
		}
	}
	public String findMax(String a, String b) {
		if(a.length()>b.length()) {
		return a;
		}
		else {
			return b;
		}
	}
}
