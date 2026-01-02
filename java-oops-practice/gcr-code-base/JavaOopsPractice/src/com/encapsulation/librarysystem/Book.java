package com.encapsulation.librarysystem;

public class Book extends LibraryItem implements Reservable{
	
	public Book(int itemid , String title ,String author) {
		super(itemid,title,author);
	}
	
	public int getLoanDuration() {
        return 14; 
    }
	
	 public void reserveItem() {
	        if (isAvailable()) {
	            setAvailable(false);
	            System.out.println("Book reserved successfully.");
	        } else {
	            System.out.println("Book is already reserved.");
	        }
	    }
	 public boolean checkAvailability() {
	        return isAvailable();
	    }

}
