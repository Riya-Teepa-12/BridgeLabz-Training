package com.day4.eventmanagementplatform;

import java.util.*;

public class UseEvent {
	
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter organizer name: ");
	        String uname = sc.nextLine();

	        System.out.print("Enter email: ");
	        String email = sc.nextLine();

	        User user = new User(uname, email);

	        System.out.print("Enter event type (Birthday/Conference): ");
	        String type = sc.next();

	        System.out.print("Event ID: ");
	        int id = sc.nextInt();

	        sc.nextLine();
	        System.out.print("Event Name: ");
	        String ename = sc.nextLine();

	        System.out.print("Location: ");
	        String loc = sc.nextLine();

	        System.out.print("Date: ");
	        String date = sc.nextLine();

	        System.out.print("Attendees: ");
	        int att = sc.nextInt();

	        System.out.print("Venue cost: ");
	        double venue = sc.nextDouble();

	        System.out.print("Service cost: ");
	        double service = sc.nextDouble();

	        System.out.print("Discount: ");
	        double discount = sc.nextDouble();

	        Event event = null;

	        if (type.equalsIgnoreCase("Birthday"))
	            event = new BirthdayEvent(id, ename, loc, date, att, venue, service, discount);
	        else
	            event = new ConferenceEvent(id, ename, loc, date, att, venue, service, discount);

	        event.schedule();
	    }

}
