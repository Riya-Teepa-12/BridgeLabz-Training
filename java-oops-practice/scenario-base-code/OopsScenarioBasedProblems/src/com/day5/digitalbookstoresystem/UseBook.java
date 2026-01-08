package com.day5.digitalbookstoresystem;

public class UseBook {
	  public static void main(String[] args) {

	        Book ebook = new EBook("Java Mastery", "James Gosling", 500);
	        Book printed = new PrintedBook("DSA Handbook", "Robert Lafore", 700, 10);

	        Order order = new Order("Prince");

	        order.addBook(ebook, 2);
	        order.addBook(printed, 1);

	        System.out.println("Order Status: " + order.getStatus());
	        System.out.println("Total Cost: ₹" + order.calculateTotal());
	    }

}
