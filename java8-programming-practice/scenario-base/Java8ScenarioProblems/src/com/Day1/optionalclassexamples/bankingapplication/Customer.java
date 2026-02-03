package com.Day1.optionalclassexamples.bankingapplication;

import java.util.Optional;

public class Customer {
    private String name;
    private Loan loan;
    private BankAccount account;

    public Customer(String name, Loan loan, BankAccount account) {
        this.name = name;
        this.loan = loan;
        this.account = account;
    }

    public Optional<Loan> getLoan() {
        return Optional.ofNullable(loan);
    }

    public BankAccount getAccount() {
        return account;
    }
}
