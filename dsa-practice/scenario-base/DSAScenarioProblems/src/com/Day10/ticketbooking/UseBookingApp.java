package com.Day10.ticketbooking;

public class UseBookingApp {
	 public static void main(String[] args) {

	        AVLTree booking = new AVLTree();

	        booking.addEvent(1800, "Rock Concert");
	        booking.addEvent(1400, "Tech Conference");
	        booking.addEvent(2000, "Comedy Show");
	        booking.addEvent(1000, "Morning Yoga");

	        System.out.println("Upcoming Events:");
	        booking.showUpcomingEvents();

	        System.out.println("\nCancelling Tech Conference...");
	        booking.cancelEvent(1400);

	        System.out.println("Updated Events:");
	        booking.showUpcomingEvents();
	    }
}
