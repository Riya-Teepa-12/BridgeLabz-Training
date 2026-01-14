package com.Day3.deliverychainmanager;

public class ParcelTracker {
      Node head;
      Node prev=null;
       
      public void addParcel(String data) {
    	  Node p = new Node(data);
    	  if(head==null) {
    		  head=p;
    		  //System.out.println("hii");
    		  return;
    	  }
    	  Node temp=head;
    	  while(temp.next!=null) {
    		  temp=temp.next;
    	  }
    	  
    	  temp.next = p;
    	  
      }
      
      public void showStages() {
    	  if(head==null) {
    		 System.out.println("Parsel is missing ");
    		  return;
    	  }
    	  Node temp = head;
    	  System.out.println("Current Status:  ");
    	  while(temp!=null) {
    		  System.out.println(temp.data);
    		  prev=temp;
    		  temp = temp.next;
    	  }
    	  if(!prev.data.equalsIgnoreCase("Delivered")) {
    		  System.out.println("Parcel is missing");
    	  }
    	  
      }
      
      public void customStage(String stage, int pos) {
    	  Node p = new Node(stage);

    	    // invalid position
    	    if (pos <= 0) {
    	        System.out.println("Invalid position");
    	        return;
    	    }

    	    
    	    // Parcel tracking missing (head is null)
    	    if (head == null) {
    	        if (pos == 1) {
    	            head = p;   // first stage added
    	        } else {
    	            System.out.println("Parcel tracking lost. Cannot insert at position " + pos);
    	        }
    	        return;
    	    }
    	    
    	    // insert at beginning
    	    if (pos == 1) {
    	        p.next = head;
    	        head = p;
    	        return;
    	    }

    	    // insert in between
    	    Node temp = head;
    	    int count = 1;

    	    while (temp != null && count < pos - 1) {
    	        temp = temp.next;
    	        count++;
    	    }

    	    // position out of range
    	    if (temp == null) {
    	        System.out.println("Position out of range");
    	        return;
    	    }

    	    p.next = temp.next;
    	    temp.next = p;
        }
      
        
}
