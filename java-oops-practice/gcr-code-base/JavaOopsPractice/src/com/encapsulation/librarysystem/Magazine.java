package com.encapsulation.librarysystem;

public class Magazine extends LibraryItem implements Reservable{
	
	public Magazine(int itemid , String title ,String author) {
		super(itemid,title,author);
	}
	
	public int getLoanDuration() {
        return 14; 
    }
	
	 public void reserveItem() {
	        if (isAvailable()) {
	            setAvailable(false);
	            System.out.println("Magazine reserved successfully.");
	        } else {
	            System.out.println("Magazine is already reserved.");
	        }
	    }
	 public boolean checkAvailability() {
	        return isAvailable();
	    }

}
