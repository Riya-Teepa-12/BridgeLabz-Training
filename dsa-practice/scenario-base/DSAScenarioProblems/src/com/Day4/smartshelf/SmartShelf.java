package com.Day4.smartshelf;


import java.util.ArrayList;
import java.util.List;

public class SmartShelf {
		private List<Book> books = new ArrayList<>();

	    // Add book + apply insertion sort immediately
	    public void addBook(String title) {
	        Book newBook = new Book(title);
	        books.add(newBook);  

	        int i = books.size() - 1; 
	        int j = i - 1;

	        // Insertion Sort logic 
	        while (j >= 0 && books.get(j).getTitle()
	                .compareToIgnoreCase(newBook.getTitle()) > 0) {
	            books.set(j + 1, books.get(j));
	            j--;
	        }

	        books.set(j + 1, newBook);
	    }

	    // Display shelf
	    public void displayShelf() {
	        System.out.println("SmartShelf:");
	        for (Book book : books) {
	            System.out.println(book.getTitle());
	        }
	    }

	    // Main method
	    public static void main(String[] args) {
	        SmartShelf shelf = new SmartShelf();

	        // Real-time additions
	        shelf.addBook("Java");
	        shelf.addBook("Algorithms");
	        shelf.addBook("Data Structures");
	        shelf.addBook("Cloud Computing");

	        shelf.displayShelf();
	    
	}

}
