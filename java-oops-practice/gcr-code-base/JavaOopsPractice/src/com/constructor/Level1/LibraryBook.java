package com.constructor.Level1;

public class LibraryBook {
	   private String title;
	    private String author;
	    private double price;
	    private boolean available;

	    // Constructor
	    LibraryBook(String title, String author, double price) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.available = true; // book is available initially
	    }

	    // Method to borrow a book
	    public void borrowBook() {
	        if (available) {
	            available = false;
	            System.out.println("You have successfully borrowed: " + title);
	        } else {
	            System.out.println("Sorry, the book '" + title + "' is already borrowed.");
	        }
	    }

	    // Method to display book details
	   public  void displayDetails() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Price: ₹" + price);
	        System.out.println("Available: " + (available ? "Yes" : "No"));
	        System.out.println("------------------------");
	    }
	
       public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Java Programming", "James Gosling", 499.99);

        book1.displayDetails();
        book1.borrowBook();   
        book1.borrowBook(); 
        book1.displayDetails();
    }



	
	
	
	
}
