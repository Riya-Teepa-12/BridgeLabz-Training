package com.Day1.functionalinterface.comparatorexamples;

import java.util.*;

class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
}

public class BankAccountComparator {
    public static void main(String[] args) {

        List<BankAccount> accounts = Arrays.asList(
                new BankAccount("Anil", 40000),
                new BankAccount("Sunita", 80000)
        );

        accounts.sort(Comparator.comparingDouble(a -> a.balance));

        accounts.forEach(a ->
                System.out.println(a.accountHolder + " - Balance: " + a.balance));
    }
}
