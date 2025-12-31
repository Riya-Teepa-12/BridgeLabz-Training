package com.objectmodelling.Level1;

public class Customer {
	 private String name;
	    private double balance;
	    private Bank bank;

	    public Customer(String name) {
	        this.name = name;
	    }

	    // setters used for association
	    public void setBank(Bank bank) {
	        this.bank = bank;
	    }

	    public void  setBalance(double balance) {
	        this.balance = balance;
	    }

	    // communication method
	    public void viewBalance() {
	        System.out.println("Customer: " + name);
	        System.out.println("Bank: " + bank.getBankName());
	        System.out.println("Balance: ₹" + balance);
	    }
}
