package com.OnSoft.training;

public class AtSplit {
	
	public static void main(String[] args) {
		String s = "CREATE@Read@UPDATE@Delete";
		String[] words = s.split("@");
		boolean check = false;
		for(int i=0;i<words.length;i++) {
//			String temp = "";
//			for(int j = 0;j<words[i].length();j++) {
//				if(words[i].charAt(j)>='A' && words[i].charAt(j)<='Z') {
//					check = true;
//				}
//				else {
//					check = false;
//				}
//			}
//			if(check==true) {
//				System.out.println(words[i]);
//			}
//			words[i]=temp;
			String upper = words[i].toUpperCase();
			if(words[i].equals(upper)) {
				System.out.println(words[i]);
			}
		}
	}

}
