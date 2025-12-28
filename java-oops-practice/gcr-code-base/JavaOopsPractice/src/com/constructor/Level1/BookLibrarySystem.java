package com.constructor.Level1;

public class BookLibrarySystem {
	
	public static void main(String[] args) {

        EBook ebook = new EBook(
                "978-0134685991",
                "Java",
                "Riya Teepa",
                5.4
        );

        ebook.displayEBookDetails();

        ebook.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
	

}
