package com.Day1.libraryorganizer;

import java.util.*;

public class UseLibrary {
    public static void main(String []args) {
    	
    	BookShelf book = new BookShelf();
    	List<Book> fiction = new LinkedList<>();
    	   fiction.add(new Book("The great tragedy","k-Jahn",2));
    	   fiction.add(new Book("Gone Girl","Gillian Flyn",5));
    	   book.addGenre("Fiction",fiction);
    	   
    	   List<Book> Romantic = new LinkedList<>();
    	   Romantic.add(new Book("The tragedy","Jahn",4));
    	   Romantic.add(new Book("Girl","Flyn",5));
    	   book.addGenre("Romantic",Romantic);
    	   
    	   book.borrowBook("Fiction", "The great tragedy");
    	   book.borrowBook("Fiction", "The great tragedy");
    	   book.borrowBook("Fiction", "The great tragedy");
    	   book.borrowBook("Fiction", "The great tragedy");
    	   book.returnBook("Fiction", "The great tragedy");
    	   
    	   
    }
}
