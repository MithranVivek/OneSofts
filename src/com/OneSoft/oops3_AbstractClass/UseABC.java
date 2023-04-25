package com.OneSoft.oops3_AbstractClass;

public class UseABC {

	public static void main(String[] args) {
		ABC a = new ABC();
		System.out.println(a.name("vivek")+"\n"+
							a.age(31)+"\n"+
							a.distric("chengalpattu")+"\n"+
							a.pinCode(603204)+"\n"+
							a.voterElgible()+"\n"+
							a.votedYears(5));

	}

}
