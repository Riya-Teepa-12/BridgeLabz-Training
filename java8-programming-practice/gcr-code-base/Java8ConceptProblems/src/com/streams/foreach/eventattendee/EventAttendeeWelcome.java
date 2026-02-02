package com.streams.foreach.eventattendee;

import java.util.Arrays;
import java.util.List;

public class EventAttendeeWelcome {
	 public static void main(String[] args){
	        List<String> attendees=Arrays.asList(
	            "Amit",
	            "Neha",
	            "Rahul",
	            "Priya"
	        );

	        attendees.forEach(name->System.out.println("Welcome "+name+"!"));
	    }
}  
