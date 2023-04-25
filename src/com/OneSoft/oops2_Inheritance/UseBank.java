package com.OneSoft.oops2_Inheritance;

public class UseBank {

	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.branch = "perungudi";
		a.AccHolderName = "Axis";
		a.isPrivate = true;
		System.out.println(a.findInterestAmt(200000));

	}

}

class Bank {
	String branch;
	String AccHolderName;
	public int findInterestAmt(int amt) {
		return amt*5/100;
	}
}

class AxisBank extends Bank {
	boolean isPrivate;
	
	public int findInterestAmt(int amt) {
		return amt*10/100;
	}
}