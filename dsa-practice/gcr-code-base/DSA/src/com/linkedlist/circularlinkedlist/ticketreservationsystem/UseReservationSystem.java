package com.linkedlist.circularlinkedlist.ticketreservationsystem;

import java.util.*;

public class UseReservationSystem {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        TicketReservationSystem system = new TicketReservationSystem();
              
	        
	        while (true) {
	            System.out.println("\n--- Ticket Reservation Menu ---");
	            System.out.println("1. Book Ticket");
	            System.out.println("2. Cancel Ticket");
	            System.out.println("3. Display All Tickets");
	            System.out.println("4. Search Ticket");
	            System.out.println("5. Total Booked Tickets");
	            System.out.println("6. Exit");
	            System.out.print("Enter choice: ");
                
	            int choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Ticket ID: ");
	                    int id = sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Enter Customer Name: ");
	                    String customer = sc.nextLine();
	                    System.out.print("Enter Movie Name: ");
	                    String movie = sc.nextLine();
	                    System.out.print("Enter Seat Number: ");
	                    String seat = sc.nextLine();
	                    System.out.print("Enter Booking Time: ");
	                    String time = sc.nextLine();

	                    system.addTicket(id, customer, movie, seat, time);
	                    break;

	                case 2:
	                    System.out.print("Enter Ticket ID to Cancel: ");
	                    system.removeTicket(sc.nextInt());
	                    break;

	                case 3:
	                    system.displayTickets();
	                    break;

	                case 4:
	                    System.out.print("Enter Customer or Movie Name: ");
	                    system.searchTicket(sc.nextLine());
	                    break;

	                case 5:
	                    system.totalTickets();
	                    break;

	                case 6:
	                    System.out.println("Exiting Ticket Reservation System...");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }
	    }

}
