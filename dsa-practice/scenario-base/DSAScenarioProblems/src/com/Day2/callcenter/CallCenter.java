package com.Day2.callcenter;

import java.util.*;

public class CallCenter {
	// Queue for normal customers (FIFO)
    Queue<String> normalQueue = new LinkedList<>();

    // PriorityQueue for VIP customers
    PriorityQueue<String> vipQueue = new PriorityQueue<>();

    // HashMap to track number of calls per customer
    HashMap<String, Integer> callCount = new HashMap<>();

    // Method to receive a call
    public void receiveCall(String customerName, boolean isVIP) {

     
        if (isVIP) {
            vipQueue.add(customerName);
            System.out.println(customerName + " added to VIP Queue");
        } else {
            normalQueue.add(customerName);
            System.out.println(customerName + " added to Normal Queue");
        }

        // Update call count
        callCount.put(customerName, callCount.getOrDefault(customerName, 0) + 1);
    }

   
    public void handleCall() {

        if (!vipQueue.isEmpty()) {
            String vipCustomer = vipQueue.poll();
            System.out.println("Handling VIP customer: " + vipCustomer);

        } else if (!normalQueue.isEmpty()) {
            String normalCustomer = normalQueue.poll();
            System.out.println("Handling normal customer: " + normalCustomer);

        } else {
            System.out.println("No calls to handle");
        }
    }

    // Display call count
    public void displayCallCount() {
        System.out.println("\nCustomer Call Count:");
        for (Map.Entry<String, Integer> entry : callCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " calls");
        }

    }
}
