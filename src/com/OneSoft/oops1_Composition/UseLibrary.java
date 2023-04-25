package com.OneSoft.oops1_Composition;

public class UseLibrary {

	public static void main(String[] args) {
		Book b = new Book();
		b.name = ""
				+ "Harry Potter and the Philosopher's Stone";
		b.author = "J. K. Rowling";
		b.bookType = "Fantasy novels";
		b.publishedYear = 1997;
		b.price = 1500;
		
		Library l = new Library();
		l.name = "Anna Noolagam";
		l.location = "Anna Nagar";
		l.isSubscription = true;
		l.capcity = 50;
		l.book = b;
		
		System.out.println(l.name+" "+l.location+" "+l.isSubscription+" "+l.capcity);
		System.out.println(l.book.name+" "+l.book.author+" "+l.book.bookType+" "+l.book.publishedYear+" "+l.book.price);
		

	}

}
