package com.day2.bankaccount;

public class CurrentAccount extends Account {

    private static final double INTEREST_RATE = 1.0;

    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

  
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE / 100;
    }

}
