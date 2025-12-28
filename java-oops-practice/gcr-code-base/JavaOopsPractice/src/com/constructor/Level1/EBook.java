package com.constructor.Level1;

public class EBook extends BookLibrary {
	private double fileSize;

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

   
    public void displayEBookDetails() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN (Public): " + ISBN);
        System.out.println("Title (Protected): " + title);
        System.out.println("Author : " + getAuthor());
        System.out.println("File Size: " + fileSize + " MB");
    }

}
