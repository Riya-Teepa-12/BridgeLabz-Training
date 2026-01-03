package com.day2.bankaccount;

public abstract class Account implements ITransaction {

    protected int accountNumber;
    private double balance;

    // Constructor without opening balance
    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Constructor with opening balance
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Encapsulated access to balance
    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

  
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

   
    public void checkBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }

   
    public abstract double calculateInterest();

}
