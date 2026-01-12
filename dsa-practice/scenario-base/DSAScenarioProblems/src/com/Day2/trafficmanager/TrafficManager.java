package com.Day2.trafficmanager;

import java.util.LinkedList;
import java.util.Queue;


public class TrafficManager {
	// Circular Linked List
    private VehicleNode head = null;
    private VehicleNode tail = null;

    // Queue for waiting vehicles
    private Queue<String> waitingQueue = new LinkedList<>();
    private int MAX_QUEUE_SIZE = 5;

    // Add vehicle to waiting queue
    public void addToQueue(String vehicleNo) {
        if (waitingQueue.size() == MAX_QUEUE_SIZE) {
            System.out.println("Queue Overflow! Vehicle " + vehicleNo + " cannot enter now.");
            return;
        }
        waitingQueue.add(vehicleNo);
        System.out.println("Vehicle " + vehicleNo + " added to waiting queue.");
    }

    // Move vehicle from queue to roundabout
    public void enterRoundabout() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Queue Underflow! No vehicle waiting.");
            return;
        }

        String vehicleNo = waitingQueue.poll();
        VehicleNode newNode = new VehicleNode(vehicleNo);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head; // circular
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }

        System.out.println("Vehicle " + vehicleNo + " entered the roundabout.");
    }

    // Remove a vehicle from roundabout
    public void exitRoundabout(String vehicleNo) {
        if (head == null) {
            System.out.println("Roundabout is empty!");
            return;
        }

        VehicleNode current = head;
        VehicleNode prev = tail;

        do {
            if (current.vehicleNo.equals(vehicleNo)) {

                // If only one vehicle
                if (head == tail) {
                    head = tail = null;
                } else {
                    prev.next = current.next;
                    if (current == head)
                        head = current.next;
                    if (current == tail)
                        tail = prev;
                }

                System.out.println("Vehicle " + vehicleNo + " exited the roundabout.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Vehicle not found in roundabout.");
    }

    // Print roundabout state
    public void printRoundabout() {
    	
    	 if (head == null) {
             System.out.println("Roundabout is empty.");
             return;
         }

         VehicleNode temp = head;
         System.out.print("Roundabout Vehicles: ");
         do {
             System.out.print(temp.vehicleNo + " -> ");
             temp = temp.next;
         } while (temp != head);
         System.out.println("(back to start)");
     }

     

}
