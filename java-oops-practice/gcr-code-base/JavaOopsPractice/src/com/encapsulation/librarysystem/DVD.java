package com.encapsulation.librarysystem;

public class DVD extends LibraryItem implements Reservable{
	

	public DVD(int itemid , String title ,String author) {
		super(itemid,title,author);
	}
	
	public int getLoanDuration() {
        return 28; 
    }
	
	 public void reserveItem() {
	        if (isAvailable()) {
	            setAvailable(false);
	            System.out.println("DVD reserved successfully.");
	        } else {
	            System.out.println("DVD is already reserved.");
	        }
	    }
	 public boolean checkAvailability() {
	        return isAvailable();
	    }

}
