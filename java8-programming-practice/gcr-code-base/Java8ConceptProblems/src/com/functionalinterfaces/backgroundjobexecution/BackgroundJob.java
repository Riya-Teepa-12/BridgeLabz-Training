package com.functionalinterfaces.backgroundjobexecution;

public class BackgroundJob implements Runnable {
	
	public void run() {
        System.out.println("Background job started");
        System.out.println("Background job completed");
    }

}
