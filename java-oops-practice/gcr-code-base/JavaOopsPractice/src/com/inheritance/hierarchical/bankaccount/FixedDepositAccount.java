package com.inheritance.hierarchical.bankaccount;

public class FixedDepositAccount extends BankAccount{
	private int depositDuration;

    FixedDepositAccount(int accountNumber, double balance, int depositDuration) {
        super(accountNumber, balance);
        this.depositDuration = depositDuration;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Deposit Duration: " + depositDuration + " years");
    }

}
