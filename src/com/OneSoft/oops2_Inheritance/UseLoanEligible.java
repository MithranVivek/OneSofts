package com.OneSoft.oops2_Inheritance;

public class UseLoanEligible {

	public static void main(String[] args) {
		LoanEligible l = new LoanEligible();
		System.out.println(l.loanEligibleAmt()+"\n"+
							l.loanEligibleAmt(25000)+"\n"+
							l.loanEligibleAmt(25000, 150000));

	}

}

class LoanEligible {
	public int loanEligibleAmt() {
		return 30000;
	}
	
	public int loanEligibleAmt(int salary) {
		return 30000+(salary*5);
	}
	
	public int loanEligibleAmt(int salary, int propertyValue) {
		return 30000+(salary*5)+(propertyValue*10);
	}
	
}
