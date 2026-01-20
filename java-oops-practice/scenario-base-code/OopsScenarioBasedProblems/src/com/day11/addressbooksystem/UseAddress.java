package com.day11.addressbooksystem;

import java.util.Scanner;

public class UseAddress {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        AddressBook book = new AddressBook();

	        while (true) {
	            System.out.println("\n1.Add 2.Edit 3.Delete 4.Search 5.Display 6.Exit");
	            int choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {
	                case 1:
	                    System.out.print("First Name: ");
	                    String fn = sc.nextLine();
	                    System.out.print("Last Name: ");
	                    String ln = sc.nextLine();
	                    System.out.print("Phone: ");
	                    String phone = sc.nextLine();
	                    System.out.print("Email: ");
	                    String email = sc.nextLine();

	                    System.out.print("City: ");
	                    String city = sc.nextLine();
	                    System.out.print("State: ");
	                    String state = sc.nextLine();
	                    System.out.print("Zip: ");
	                    String zip = sc.nextLine();

	                    Address addr = new Address(city, state, zip);
	                    Contact contact = new Contact(fn, ln, phone, email, addr);
	                    book.addContact(contact);
	                    break;

	                case 2:
	                    System.out.print("First Name: ");
	                    fn = sc.nextLine();
	                    System.out.print("Last Name: ");
	                    ln = sc.nextLine();
	                    System.out.print("New Phone: ");
	                    phone = sc.nextLine();
	                    System.out.print("New Email: ");
	                    email = sc.nextLine();

	                    System.out.print("City: ");
	                    city = sc.nextLine();
	                    System.out.print("State: ");
	                    state = sc.nextLine();
	                    System.out.print("Zip: ");
	                    zip = sc.nextLine();

	                    book.editContact(fn, ln, phone, email, new Address(city, state, zip));
	                    break;

	                case 3:
	                    System.out.print("First Name: ");
	                    fn = sc.nextLine();
	                    System.out.print("Last Name: ");
	                    ln = sc.nextLine();
	                    book.deleteContact(fn, ln);
	                    break;

	                case 4:
	                    System.out.print("Enter City or State: ");
	                    String value = sc.nextLine();
	                    book.searchByCityOrState(value);
	                    break;

	                case 5:
	                    book.displayContacts();
	                    break;

	                case 6:
	                    System.out.println("👋 Exiting...");
	                    sc.close();
	                    return;
	            }
	        }
	    }
	}
