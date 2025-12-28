package com.constructor.Level1;
public class HotelBooking {
	    
	    //Attributes
	   private String guestName;
	   private String roomType;
	   private  int nights;

	    // Default constructor
	    public HotelBooking() {
	        this.guestName = "Unknown Guest";
	        this.roomType = "Standard";
	        this.nights = 1;
	    }

	    // Parameterized constructor
	    public HotelBooking(String guestName, String roomType, int nights) {
	        this.guestName = guestName;
	        this.roomType = roomType;
	        this.nights = nights;
	    }

	    // Copy constructor
	    public HotelBooking(HotelBooking booking) {
	        this.guestName = booking.guestName;
	        this.roomType = booking.roomType;
	        this.nights = booking.nights;
	    }

	    // Method to display booking details
	    public  void displayBooking() {
	        System.out.println("Guest Name: " + guestName);
	        System.out.println("Room Type: " + roomType);
	        System.out.println("Nights: " + nights);
	        System.out.println("-----------------------");
	    }

	    // Main method to test constructors
	    public static void main(String[] args) {

	        //Using default constructor
	        HotelBooking book1 = new HotelBooking();

	        //Using parameterized constructor
	        HotelBooking book2 = new HotelBooking("Prince", "Deluxe", 3);

	        //Using copy constructor
	        HotelBooking book3 = new HotelBooking(book2);

	        book1.displayBooking();
	        book2.displayBooking();
	        book3.displayBooking();
	    


	}

}
