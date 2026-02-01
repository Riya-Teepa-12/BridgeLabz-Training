package com.functionalinterfaces.backgroundjobexecution;

public class UseBackground {
	public static void main(String[] args) {

        Runnable job = new BackgroundJob();

        JobExecutor.executeAsync(job);

        System.out.println("Main thread execution finished");
    }

}
