package com.librarycasestudy.classdiagrams;

public class SmartLibraryCatalog {
	
	public static void main(String[] args) {
		System.out.println("====================================================================================");
		System.out.println("		SMART UNIVERSITY LIBRARY MANAGEMENT SYSTEM");
		System.out.println("====================================================================================\n");
		
	        // Get the singleton catalog
	        LibraryCatalog catalog = LibraryCatalog.getInstance();

	        // Create books using Builder pattern
	        Book dsBook = new Book.BookBuilder("978-0262033848", "Introduction to Algorithms")
	                .withAuthors(" H. Cormen", "Charles Leiserson", "Clifford Stein", "Ronald L. Rivest")
	                .withEdition(3)
	                .withPublisher("MIT Press")
	                .withGenre("Computer Science")
	                .build();

	        Book javaBook = new Book.BookBuilder("978-0134685991", "Effective Java")
	                .withAuthors("Joshua Bloch")
	                .withEdition(3)
	                .withPublisher("Addison-Wesley")
	                .withGenre("Programming")
	                .build();

	        catalog.addBook(dsBook);
	        catalog.addBook(javaBook);

	        // Create users using Factory pattern
	        User alice = UserFactory.createUser("Riya", "Student");
	        User bob = UserFactory.createUser("Harshit", "Faculty");
	        User librarian1 = UserFactory.createUser("Dr. Oberoi", "Librarian");
	        User librarian2 = UserFactory.createUser("Dr. Teepa", "Librarian");

	        // Subscribe to notifications (Observer pattern)
	        dsBook.attach(alice);
	        dsBook.attach(bob);

	        // Librarian one subscribed
	        dsBook.attach(librarian1);

	        System.out.println("\n--> Someone borrowed 'Introduction to Algorithms' (Subscribed librarian notified)");
	        catalog.updateBookAvailability("934-434353558", false);

	        System.out.println("\n--> Book returned (All subscribers notified)");
	        catalog.updateBookAvailability("978-0262344848", true);

	        // Librarian two subscribed later
	        dsBook.attach(librarian2);

	        System.out.println("\n--> Book borrowed again (Subscribed librarians notified)");
	        catalog.updateBookAvailability("978-0343243848", false);
	        
		System.out.println("\n====================================================================================");
		System.out.println("		  THANKS FOR VISITING, HAPPY LEARNING!");
		System.out.println("====================================================================================");

	    }

}
