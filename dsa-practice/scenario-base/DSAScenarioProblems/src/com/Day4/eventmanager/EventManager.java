package com.Day4.eventmanager;

import java.util.Scanner;

public class EventManager {
     
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of tickets: ");
	        int n = sc.nextInt();

	        Ticket[] tickets = new Ticket[n];

	        for (int i = 0; i < n; i++) {
	            System.out.println("\nEnter details for Ticket " + (i + 1));

	            System.out.print("Ticket ID: ");
	            int id = sc.nextInt();

	            System.out.print("Ticket Price: ");
	            double price = sc.nextDouble();

	            tickets[i] = new Ticket(id, price);
	        }

	        System.out.println("\nBefore Sorting:");
	        for (Ticket t : tickets)
	            System.out.println(t);

	        QuickSort.quickSort(tickets, 0, tickets.length - 1);

	        System.out.println("\nAfter Sorting (by Price):");
	        for (Ticket t : tickets)
	            System.out.println(t);

	        sc.close();
	    }
}
