package com.encapsulation.librarysystem;

import java.util.*;

import com.encapsulation.ecommerce.Product;
import com.encapsulation.ecommerce.Taxable;

public class UseLibraryItem {
	public static void main(String []args) {
		List<LibraryItem>  list = new ArrayList<>();
	               LibraryItem item = new Book(198,"geeta","Ved-Vyas");
	                list.add(item);
		            item = new Magazine(11,"Time50%","Bheem Sen");
		            list.add(item);
		            item = new DVD(195,"The Matrix Paradise","Warner Bros");
		            list.add(item);
		            for(LibraryItem x :list)
		            displayItem(x);
	}
		            
		            public static void displayItem(LibraryItem library) {
		                  library.getItemDetails();
		                System.out.println("Duration of Loan: " + library.getLoanDuration());

		                if (library instanceof Reservable) {
		                    Reservable reservable = (Reservable)library;
		                     if(reservable.checkAvailability())
		                    	 reservable.reserveItem();
		                }else {
		                    System.out.println("Item : Not Available");
		                }

		                System.out.println("-----------------------------");
		            }
		          
		       
		
	

}
