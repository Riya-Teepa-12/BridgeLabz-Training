package com.Day1.functionalinterface.runnableexamples;

public class FileCleanupTask {
      
	public static void main(String[] args) {

        Runnable cleanupTask = () -> {
            System.out.println("Cleaning temporary files...");
            // File cleanup logic here
        };

        new Thread(cleanupTask).start();
    }
}
