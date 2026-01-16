package com.Day4.eventmanager;

public class Ticket {
	
	int ticketId;
    double price;

    Ticket(int ticketId, double price) {
        this.ticketId = ticketId;
        this.price = price;
    }

    
    public String toString() {
        return "Ticket ID: " + ticketId + ", Price: " + price;
    }

}
