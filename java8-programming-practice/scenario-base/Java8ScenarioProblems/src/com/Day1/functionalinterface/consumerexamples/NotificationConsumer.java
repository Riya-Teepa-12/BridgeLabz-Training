package com.Day1.functionalinterface.consumerexamples;

import java.util.function.Consumer;

public class NotificationConsumer {
         
	  public static void main(String[] args) {

	        Consumer<String> sendNotification =
	                message -> System.out.println(
	                        "Notification sent: " + message);

	        sendNotification.accept("Your order has been shipped!");
	    }
} 
