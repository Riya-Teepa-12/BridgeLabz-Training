package com.Day1.libraryorganizer;

import java.util.*;

public class BookShelf {
     
	private String genre;
	List<Book> fiction = new LinkedList<>();
	Map<String,List<Book>> map = new HashMap<>();
	public void addGenre(String genre,List<Book> list) {
	     map.put(genre, list);
	}
	
	public void borrowBook(String genre, String bookname) {
		List<Book> booklist = map.get(genre);
		for(Book b : booklist) {
			if(b.getTitle().equalsIgnoreCase(bookname) && b.getStock()>0) {
				System.out.println("Book borrowed sucessfully");
				b.setStock(b.getStock()-1);
				return;
			}
			
		}
		System.out.println("Book is not available");
	}
	
	public void returnBook(String genre, String bookname) {
		List<Book> booklist = map.get(genre);
		for(Book b : booklist) {
			if(b.getTitle().equalsIgnoreCase(bookname)) {
				System.out.println("Book return sucessfully");
				b.setStock(b.getStock()+1);
				return;
			}
		}
		System.out.println("Book not available");
	}
	
}
