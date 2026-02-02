package com.streams.foreach.emailnotifications;

import java.util.Arrays;
import java.util.List;

public class EmailNotifications {
	 public static void sendEmailNotification(String email){
	        System.out.println("Notification sent to "+email);
	    }
	    public static void main(String[] args){
	        List<String> emails=Arrays.asList(
	            "riya@gmail.com",
	            "piya@gmail.com",
	            "jiya@gmail.com"
	        );

	        emails.forEach(email->sendEmailNotification(email));
	    }
}
