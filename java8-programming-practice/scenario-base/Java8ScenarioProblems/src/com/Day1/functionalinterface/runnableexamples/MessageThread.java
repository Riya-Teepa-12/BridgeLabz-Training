package com.Day1.functionalinterface.runnableexamples;

public class MessageThread {
	 public static void main(String[] args) {

	        Runnable messageTask = () -> {
	            System.out.println("Hello from a separate thread!");
	        };

	        Thread t = new Thread(messageTask);
	        t.start();
	    }
}
