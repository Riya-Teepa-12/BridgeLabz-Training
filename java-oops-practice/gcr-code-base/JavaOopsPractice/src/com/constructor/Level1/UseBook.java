package com.constructor.Level1;

public class UseBook {

	public static void main(String[] args) {
		Book b = new Book();
		Book b1 = new Book("Rich dad poor dad","Robert Kiyosaki",500);
		  b.displayDetails();
		  System.out.println("---------------");
		  b1.displayDetails();
		
	
	}

}
