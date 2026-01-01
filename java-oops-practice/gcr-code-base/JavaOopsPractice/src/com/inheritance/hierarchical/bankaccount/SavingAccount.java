package com.inheritance.hierarchical.bankaccount;

public class SavingAccount extends BankAccount{
	private double interestRate;

    SavingAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
