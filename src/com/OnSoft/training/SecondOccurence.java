package com.OnSoft.training;

public class SecondOccurence {
	
	public static void main(String[] args) {
		String s = "madam";
		int index = 0;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					index = s.indexOf(s.charAt(j));
					
				}
				
			}
		
		System.out.println(index);
		}
	}

}
