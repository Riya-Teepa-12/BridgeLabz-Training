package com.Day2.traincompanion;

public class Compartment {
	//private String name;
	Node2 head;
	Node2 tail;
	Node2 current;
	
	
	public void addCompartment(String name){
		Node2 p = new Node2(name);
		if(head==null) {
			head=p;
			return;
		}
	     current=head;
	   while(current.next!=null) {
		   current = current.next;
	   }
	   current.next = p;
	   p.prev = current;
		tail =p;
	}
	
	public void deleteCompartment(String name) {
		 if (head == null)
		        return;

		    Node2 current = head;

		    while (current != null) {

		        if (current.name.equalsIgnoreCase(name)) {

		            if (current.prev == null && current.next == null) {
		                head = null;
		                tail = null;
		            }
		          
		            else if (current.prev == null) {
		                head = current.next;
		                head.prev = null;
		            }
		            else if (current.next == null) {
		                tail = current.prev;
		                tail.next = null;
		            }
		        
		            else {
		                current.prev.next = current.next;
		                current.next.prev = current.prev;
		            }
		            return; 
		        }

		        current = current.next;
		    }
	}
		
	
	 public void forward() {
	         if(head == null)
	        	 return ;
	         current = head;
	         while(current!=null) {
	        	 System.out.println(current.name);
	        	    current=current.next;
	         }
	     
	    }

	    // Backward navigation
	    public void backward() {
	       if(head == null)
	    	   return;
	       current = tail;
	       while(tail!=null) {
	    	   System.out.println(tail.name);
	    	   tail = tail.prev;
	       }
	      
	    }

	    
	  public void searchCompartment(String name) {
		  current = head;
		  while(current.next!=null) {
			  if(current.name.equalsIgnoreCase(name)) {
				  System.out.println("String is founded"+current.name);
			  }
			  current = current.next;
		  }
	  }
	  
	  public void adjacentCompartment(String name) {
		  if(head==null) {
			  System.out.println("There is no compartment");
			  return;
		  }
		  current = head;
		  while(current.next!=null) {
			  if(current.name.equalsIgnoreCase(name)) {
				  if(current.prev!=null) {
					  System.out.println("Left side compartment"+current.prev.name);
				  }
				  if(current.next!=null) {
					  System.out.println("right side compartment"+current.next.name);
				  }
			  }
			  
			  current = current.next;
		  }
	  }



 }
