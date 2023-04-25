package com.OneSoft.collections1_ArrayList;

import java.util.ArrayList;

public class NishanthiMamTask {
	
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("Dhinesh");
		words.add("Vivek");
		words.add("Sajin");
		words.add("Sundar");
		words.add("Gokul");
		words.add("selvan");
		System.out.println("Forword------");
		for(int i=0;i<words.size();i++) {
			System.out.println(words.get(i));
		}
		System.out.println("\n"+"Reverse---------");
		for(int i=words.size()-1;i>=0;i--) {
			System.out.println(words.get(i));
		}
		System.out.println("\n"+"Enhansed loop--------");
		for(String x : words) {
			System.out.println(x);
		}
		System.out.println("\n"+"ForEach loop--------");
		
		words.forEach(x->System.out.println(x));
		System.out.println("\n"+"Last letter---------");
		for(int i=0;i<words.size();i++) {
			System.out.println(words.get(i).charAt(words.get(i).length()-1));
		}
		System.out.println("Vowels---------");
		words.forEach(x->{
			
			if(x.contains("a")||x.contains("e")||x.contains("i")||x.contains("o")||x.contains("u")) {
				System.out.println("Contains");
			}
			else {
				System.out.println("Not");
			}
		});
	}

}
