package com.inheritance.singlelevel.LibraryManagement;

public class Book {
	//attributes
    private String title;
    private int publicationYear;
    
    
    //constructor
	public Book(String title, int publicationYear) {
		this.title = title;
		this.publicationYear = publicationYear;
	}
    
	//method to display details
	public void displayInfo() {
		System.out.println("The tile of book is "+title);
		System.out.println("The publication year is "+publicationYear);
	}
}
