package com.objectmodelling.Level1;

public class UseBank {
	    public static void main(String[] args) {
	    	 Bank bank = new Bank("SBI");
	         Customer customer = new Customer("Prince");

	         bank.openAccount(customer);   // association created
	         customer.viewBalance();
	    }
	}

