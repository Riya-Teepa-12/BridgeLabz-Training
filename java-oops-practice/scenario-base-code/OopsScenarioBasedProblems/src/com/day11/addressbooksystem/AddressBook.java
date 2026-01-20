package com.day11.addressbooksystem;

import java.util.*;

public class AddressBook {
      
	 private ArrayList<Contact> contacts = new ArrayList<>();

	    // Add Contact (Duplicate Validation)
	    public void addContact(Contact contact) {
	        for (Contact c : contacts) {
	            if (c.getFullName().equalsIgnoreCase(contact.getFullName())) {
	                System.out.println("Duplicate contact not allowed.");
	                return;
	            }
	        }
	        contacts.add(contact);
	        System.out.println("Contact added successfully.");
	    }

	    // Edit Contact
	    public void editContact(String firstName, String lastName, String phone, String email, Address address) {
	        for (Contact c : contacts) {
	            if (c.getFullName().equalsIgnoreCase(firstName + " " + lastName)) {
	                c.setPhone(phone);
	                c.setEmail(email);
	                c.setAddress(address);
	                System.out.println("Contact updated.");
	                return;
	            }
	        }
	        System.out.println("Contact not found.");
	    }

	    // Delete Contact
	    public void deleteContact(String firstName, String lastName) {
	        Iterator<Contact> iterator = contacts.iterator();
	        while (iterator.hasNext()) {
	            Contact c = iterator.next();
	            if (c.getFullName().equalsIgnoreCase(firstName + " " + lastName)) {
	                iterator.remove();
	                System.out.println("Contact deleted.");
	                return;
	            }
	        }
	        System.out.println("Contact not found.");
	    }

	    // Search by City or State
	    public void searchByCityOrState(String value) {
	        boolean found = false;
	        for (Contact c : contacts) {
	            Address a = c.getAddress();
	            if (a != null && (a.getCity().equalsIgnoreCase(value) || a.getState().equalsIgnoreCase(value))) {
	                System.out.println(c);
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("No contacts found.");
	        }
	    }

	    // Display Sorted Contacts
	    public void displayContacts() {
	        contacts.sort(Comparator.comparing(Contact::getFullName));
	        System.out.println("\nAddress Book:");
	        for (Contact c : contacts) {
	            System.out.println(c);
	        }
	    }
}
