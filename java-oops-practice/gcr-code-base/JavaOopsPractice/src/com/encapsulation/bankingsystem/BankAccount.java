package com.encapsulation.bankingsystem;

public abstract class BankAccount {
	
	// Encapsulation 
    private String accountNumber;
    private String holderName;
    protected double balance;   

    // Constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getter methods (no direct access to sensitive data)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Concrete method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Concrete method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    // Abstract method
    public abstract double calculateInterest();

    // Common display method
    public void displayAccountDetails() {
        System.out.println("Account No : " + accountNumber);
        System.out.println("Holder     : " + holderName);
        System.out.println("Balance    : ₹" + balance);
    }
      
}
