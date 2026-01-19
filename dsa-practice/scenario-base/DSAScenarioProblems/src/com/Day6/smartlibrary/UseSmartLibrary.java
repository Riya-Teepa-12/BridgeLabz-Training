package com.Day6.smartlibrary;

import java.util.*;

public class UseSmartLibrary {
     
	 public static void main(String[] args) {
	        Scanner kb = new Scanner(System.in);

	        System.out.print("Enter number of borrowed books: ");
	        int n = kb.nextInt();
	        kb.nextLine(); // consume newline

	        String[] books = new String[n];

	        System.out.println("Enter book titles:");
	        for (int i = 0; i < n; i++) {
	            books[i] = kb.nextLine();
	        }

	        SmartLibrary.insertionSort(books);

	        System.out.println("\nSorted Borrowed Books:");
	        for (String book : books) {
	            System.out.println(book);
	        }
	    }
}
