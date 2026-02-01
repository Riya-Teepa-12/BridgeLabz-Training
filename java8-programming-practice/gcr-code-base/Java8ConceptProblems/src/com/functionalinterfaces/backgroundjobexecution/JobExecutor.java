package com.functionalinterfaces.backgroundjobexecution;

public class JobExecutor {
	 public static void executeAsync(Runnable task) {

	        Thread thread = new Thread(task);
	        thread.start();
	    }

}
