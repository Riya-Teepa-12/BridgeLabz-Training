package com.junittesting.com;

public class TaskUtils {
	// Simulate long-running task
    public static String longRunningTask() {
        try {
            Thread.sleep(3000); // sleep 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Task Completed";
    }
}
