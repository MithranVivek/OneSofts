package com.OneSoft.function;

public class ForLoop {
	
	public void loop(int a) {
		for(int i=0;i<a;i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		ForLoop f = new ForLoop();
		f.loop(4);
	}

}
