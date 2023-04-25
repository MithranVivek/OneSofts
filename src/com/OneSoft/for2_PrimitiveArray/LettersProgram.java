package com.OneSoft.for2_PrimitiveArray;

public class LettersProgram {
	
	public static void main(String[] args) {
		String word = "pepper", rev="";
		int count = 0, countV = 0;
		char[] letter = word.toCharArray(); 
		
		for(int i=letter.length-1;i>=0;i--) {
			
			rev = rev+letter[i];
			
			if(letter[i]=='p') {
				count = count+1;
			}
			
			if(letter[i]=='a'||letter[i]=='e'||letter[i]=='i'||letter[i]=='o'||letter[i]=='u') {
				countV = countV + 1;
			}
		}
		System.out.println(rev+"\n");
		
		System.out.println("Count of letter P :"+count+"\n");
		
		System.out.println("Count of vowels :"+countV);
		
	}

}
