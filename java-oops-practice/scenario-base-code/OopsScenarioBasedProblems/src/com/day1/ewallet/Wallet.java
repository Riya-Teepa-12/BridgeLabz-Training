package com.day1.ewallet;

import java.util.ArrayList;
import java.util.List;

public abstract class Wallet implements Transferrable {
    private double balance;
    protected List<Transaction> history = new ArrayList<>();

    public Wallet(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    protected void addBalance(double amount) {
        balance += amount;
    }

    protected boolean deductBalance(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void showHistory() {
        for (Transaction t : history) {
            System.out.println(t.getDetails());
        }
    }

}
