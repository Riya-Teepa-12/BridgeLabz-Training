package com.Day2.libraryorganizer;

public class UseBookShelf {
	public static void main(String[] args) {

        BookShelf shelf = new BookShelf();

        shelf.addBook("Fiction", "Harry Potter", "J.K. Rowling");
        shelf.addBook("Fiction", "The Hobbit", "Tolkien");
        shelf.addBook("Science", "Brief History of Time", "Stephen Hawking");

        shelf.displayLibrary();

        shelf.borrowBook("Fiction", "Harry Potter");

        System.out.println("\nAfter Borrowing:\n");
        shelf.displayLibrary();
    }

}
