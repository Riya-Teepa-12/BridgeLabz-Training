package com.linkedlist.singlylinkedlist.employeemanagement;

public class UseEmployeeLinkedList {
	    public static void main(String []args) {
       EmployeeLinkedList list = new EmployeeLinkedList();
                          list.addAtBeginning(123,"Jiya","IT",90000);
                          list.addAtBeginning(189, "Riya", "Financial Department", 800000);
                          list.addAtEnd(45,"Rishabh" , "Commercial", 9890);
                          list.addAtSpecificPosition(2, 145, "viju", "IT", 0);
                          
                          // Add at specific position
                          list.addAtSpecificPosition(2, 104, "Sneha", "Marketing", 48000);

                          // Search employee by ID and Name
                          System.out.println("\nSearching Employee:");
                          list.searchElement(102, "Anita");

                          // Delete an employee
                          System.out.println("\nDeleting Employee with ID 101:");
                          list.deleteNode(189);

                          // Search deleted employee
                          System.out.println("\nSearching Deleted Employee:");
                          list.searchElement(45, "Rishabh");
                          
                          // Display again after deletion
                          list.displayAllEmployees();
	    }
}
