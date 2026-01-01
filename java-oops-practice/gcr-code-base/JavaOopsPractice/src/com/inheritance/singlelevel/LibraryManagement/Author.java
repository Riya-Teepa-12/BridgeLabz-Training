package com.inheritance.singlelevel.LibraryManagement;

public class Author extends Book {
    private String name;
    private String bio;
    
    Author(String title, int publicationYear , String name, String bio){
    	super(title,publicationYear);
    	this.name=name;
    	this.bio=bio;
    }
    
    public void displayInfo() {
    	super.displayInfo();
    	System.out.println("The name of author is"+name);
    	System.out.println("The bio :"+bio);
    }
}
