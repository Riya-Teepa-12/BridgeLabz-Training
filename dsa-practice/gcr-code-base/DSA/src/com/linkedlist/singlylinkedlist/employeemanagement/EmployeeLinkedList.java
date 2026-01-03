package com.linkedlist.singlylinkedlist.employeemanagement;

public class EmployeeLinkedList {
      private EmployeeNode head;
     
      public void addAtBeginning(int id, String name, String department, double salary) {
    	  EmployeeNode newNode = new EmployeeNode(id,name,department,salary);
    	    newNode.next =  head;
    	    head= newNode;
    	  }
      public void addAtEnd(int id, String name, String dept, double salary) {
          EmployeeNode newNode = new EmployeeNode(id, name, dept, salary);

          if (head == null) {
              head = newNode;
              return;
          }

          EmployeeNode temp = head;
          while (temp.next != null) {
              temp = temp.next;
          }
          temp.next = newNode;
      }
      
      public void addAtSpecificPosition(int position, int id, String name, String dept, double salary) {
    	  EmployeeNode newNode = new EmployeeNode(id, name, dept, salary);

    	  if (position <= 1) {
              addAtBeginning(id, name, dept, salary);
              return;
          }
          EmployeeNode temp = head;
          for (int i = 1; i < position - 1 && temp != null; i++) {
              temp = temp.next;
          }

          if (temp == null) {
              System.out.println("Invalid position");
              return;
          }

          newNode.next = temp.next;
          temp.next = newNode;
      }
      
      public void deleteNode(int id) {
    	  if (head == null) return;

          if (head.id == id) {
              head = head.next;
              return;
          }

          EmployeeNode temp = head;
          while (temp.next != null && temp.next.id != id) {
              temp = temp.next;
          }

          if (temp.next == null) {
              System.out.println("Employee not found");
          } else {
              temp.next = temp.next.next;
              System.out.println("Employee deleted successfully.");
          }
    	     
      }
      public  void searchElement(int id, String name) {
    	    if (head == null) return ;
    	

    	    EmployeeNode temp=head;
    	    while(temp!=null && temp.id !=id && !temp.name.equals(name)) {
    	           temp = temp.next;
    	    }
    	    if (temp == null) {
                System.out.println("Employee not found");
            } else {
            	 System.out.println("Employee founded");
            	  displayEmployee(temp);
            	
            }
    	    
      }
      
      public void displayEmployee(EmployeeNode e) {
	        System.out.println("ID: " + e.id +
	                ", Name: " + e.name +
	                ", Dept: " + e.department +
	                ", Salary: " + e.salary);
	    }
      
      public void displayAllEmployees() {
    	    if (head == null) {
    	        System.out.println("No employee records available.");
    	        return;
    	    }

    	    EmployeeNode temp = head;
    	    System.out.println("\nEmployee Records:");
    	    while (temp != null) {
    	        displayEmployee(temp);
    	        temp = temp.next;
    	    }
    	}

          
   }
    
      

