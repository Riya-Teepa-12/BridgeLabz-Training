package com.linkedlist.doublylinkedlist.moviemanagementsystem;

import java.util.*;

public class UseMovieApp {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        MovieDoublyLinkedList list = new MovieDoublyLinkedList();

	        while (true) {
	            System.out.println("\n1.Add at Beginning\n2.Add at End\n3.Add at Position");
	            System.out.println("4.Remove by Title\n5.Search by Director\n6.Search by Rating");
	            System.out.println("7.Display Forward\n8.Display Reverse\n9.Update Rating\n10.Exit");
	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {
	                case 1:
	                case 2:
	                case 3:
	                    System.out.print("Title: ");
	                    String title = sc.nextLine();
	                    System.out.print("Director: ");
	                    String director = sc.nextLine();
	                    System.out.print("Year: ");
	                    int year = sc.nextInt();
	                    System.out.print("Rating: ");
	                    double rating = sc.nextDouble();

	                    if (choice == 1)
	                        list.addAtBeginning(title, director, year, rating);
	                    else if (choice == 2)
	                        list.addAtEnd(title, director, year, rating);
	                    else {
	                        System.out.print("Position: ");
	                        int pos = sc.nextInt();
	                        list.addAtPosition(pos, title, director, year, rating);
	                    }
	                    break;

	                case 4:
	                    System.out.print("Enter title: ");
	                    list.removeByTitle(sc.nextLine());
	                    break;

	                case 5:
	                    System.out.print("Enter director: ");
	                    list.searchByDirector(sc.nextLine());
	                    break;

	                case 6:
	                    System.out.print("Enter rating: ");
	                    list.searchByRating(sc.nextDouble());
	                    break;

	                case 7:
	                    list.displayForward();
	                    break;

	                case 8:
	                    list.displayReverse();
	                    break;

	                case 9:
	                    System.out.print("Title: ");
	                    title = sc.nextLine();
	                    System.out.print("New Rating: ");
	                    rating = sc.nextDouble();
	                    list.updateRating(title, rating);
	                    break;

	                case 10:
	                    System.exit(0);
	            }
	        }
	    }

}
