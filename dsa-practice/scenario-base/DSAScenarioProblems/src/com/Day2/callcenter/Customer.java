package com.Day2.callcenter;

import java.time.LocalTime;
import java.util.*;

public class Customer {
	
	 // Main method
    public static void main(String[] args) {

        CallCenter callCenter = new CallCenter();

        // Receiving calls
        callCenter.receiveCall("Ravi", false);
        callCenter.receiveCall("Amit", true);
        callCenter.receiveCall("Neha", false);
        callCenter.receiveCall("Amit", true);
        callCenter.receiveCall("Suresh", false);

        System.out.println("\nHandling Calls:\n");

        // Handling calls
        callCenter.handleCall();
        callCenter.handleCall();
        callCenter.handleCall();
        callCenter.handleCall();
        callCenter.handleCall();

        // Display call history
        callCenter.displayCallCount();
    }

}
