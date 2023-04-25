package com.OneSoft.function;

public class StudentResult {
	
	public void total(int t,int e,int m,int s,int ss) {
		System.out.println("Total="+(t+e+m+s+ss));
	}
	
	public String average(int t,int e,int m,int s,int ss) {
		int avg = (t+e+m+s+ss)/5;
		return "Average="+avg;
	}
	public static void main(String[] args) {
		StudentResult s = new StudentResult();
		s.total(45, 55, 85, 59, 78);
		System.out.println(s.average(45, 55, 85, 59, 78));
	}

}
