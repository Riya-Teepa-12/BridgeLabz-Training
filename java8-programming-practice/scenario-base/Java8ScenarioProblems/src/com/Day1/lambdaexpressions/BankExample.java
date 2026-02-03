package com.Day1.lambdaexpressions;

import java.util.*;

class Account {
    private String holder;
    private double balance;

    public Account(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public double getBalance() { return balance; }

    @Override
    public String toString() {
        return holder + " | Balance:" + balance;
    }
}


public class BankExample {
    public static void main(String[] args) {

        List<Account> accounts = Arrays.asList(
                new Account("Amit", 5000),
                new Account("Neha", 800)
        );

        // Min balance
        accounts.forEach(a ->
                System.out.println(a + " MinBalance OK: " + (a.getBalance() >= 1000)));

        // Simple interest
        accounts.forEach(a ->
                System.out.println("Interest: " + (a.getBalance() * 5 / 100)));

        // Compare balances
        accounts.sort((a1, a2) ->
                Double.compare(a1.getBalance(), a2.getBalance()));
        System.out.println(accounts);
    }
}

