package com.Day1.functionalinterface.runnableexamples;

public class BackgroundTask {
	 public static void main(String[] args) {

	        Runnable backgroundTask = () -> {
	            System.out.println("Background task is running...");
	        };

	        Thread thread = new Thread(backgroundTask);
	        thread.start();
	    }
}
