package com.OneSoft.function;

public class StringArray {
	
	public void name(String[] name) {
		for(int i=0;i<name.length;i++) {
			if(name[i].startsWith("s")) {
				System.out.println(name[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] sa = {"sajin","dinesh","saranya","surya","vivek"};
		StringArray s = new StringArray();
		s.name(sa);
	}

}
