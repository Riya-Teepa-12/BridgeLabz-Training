package com.encapsulation.librarysystem;

public abstract class LibraryItem {
	
	    //attributes
	
        private int itemId;
        private String title;
        private String author;
        private boolean available = true;
        
        //abstract method
        public abstract int getLoanDuration();
        
        //concrete method
        public void getItemDetails() {
        	System.out.println("Item Id: "+itemId);
        	System.out.println("title: "+ title);
        	System.out.println("author : "+ author);
            System.out.println("Available: " + available);
        }

		public LibraryItem(int itemId, String title, String author) {
			this.itemId = itemId;
			this.title = title;
			this.author = author;
		}
		
		 // Encapsulation
	    public boolean isAvailable() {
	        return available;
	    }

	    protected void setAvailable(boolean available) {
	        this.available = available;
	    }


        
}
