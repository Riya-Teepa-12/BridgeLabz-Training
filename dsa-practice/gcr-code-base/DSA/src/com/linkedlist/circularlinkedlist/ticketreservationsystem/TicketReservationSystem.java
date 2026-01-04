package com.linkedlist.circularlinkedlist.ticketreservationsystem;

public class TicketReservationSystem {
	
	 private TicketNode head;
	    private int ticketCount = 0;

	    // Add ticket at end
	    public void addTicket(int id, String customer, String movie,
	                          String seat, String time) {
	        TicketNode newNode = new TicketNode(id, customer, movie, seat, time);

	        if (head == null) {
	            head = newNode;
	        } else {
	            TicketNode temp = head;
	            while (temp.next != head) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	            newNode.next = head;
	        }
	        ticketCount++;
	        System.out.println("Ticket booked successfully.");
	    }

	    // Remove ticket by ID
	    public void removeTicket(int ticketId) {
	        if (head == null) {
	            System.out.println("No tickets booked.");
	            return;
	        }

	        TicketNode temp = head;
	        TicketNode prev = null;

	        do {
	            if (temp.ticketId == ticketId) {
	                if (temp == head) {
	                    TicketNode last = head;
	                    while (last.next != head) {
	                        last = last.next;
	                    }
	                    head = head.next;
	                    last.next = head;
	                } else {
	                    prev.next = temp.next;
	                }
	                ticketCount--;
	                System.out.println("Ticket cancelled successfully.");
	                return;
	            }
	            prev = temp;
	            temp = temp.next;
	        } while (temp != head);

	        System.out.println("Ticket ID not found.");
	    }

	    // Display all tickets
	    public void displayTickets() {
	        if (head == null) {
	            System.out.println("No tickets booked.");
	            return;
	        }

	        TicketNode temp = head;
	        System.out.println("\n--- Booked Tickets ---");
	        do {
	            displayTicket(temp);
	            temp = temp.next;
	        } while (temp != head);
	    }

	    // Search by customer or movie name
	    public void searchTicket(String keyword) {
	        if (head == null) {
	            System.out.println("No tickets booked.");
	            return;
	        }

	        TicketNode temp = head;
	        boolean found = false;

	        do {
	            if (temp.customerName.equalsIgnoreCase(keyword) ||
	                temp.movieName.equalsIgnoreCase(keyword)) {
	                displayTicket(temp);
	                found = true;
	            }
	            temp = temp.next;
	        } while (temp != head);

	        if (!found) {
	            System.out.println("No matching ticket found.");
	        }
	    }

	    // Total tickets
	    public void totalTickets() {
	        System.out.println("Total Booked Tickets: " + ticketCount);
	    }

	    private void displayTicket(TicketNode t) {
	        System.out.println("Ticket ID: " + t.ticketId +
	                ", Customer: " + t.customerName +
	                ", Movie: " + t.movieName +
	                ", Seat: " + t.seatNumber +
	                ", Time: " + t.bookingTime);
	    }

}
