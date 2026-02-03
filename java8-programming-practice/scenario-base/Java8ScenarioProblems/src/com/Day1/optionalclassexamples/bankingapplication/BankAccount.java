package com.Day1.optionalclassexamples.bankingapplication;

import java.util.Optional;

class BankAccount {
    private Double balance;
    private Nominee nominee;
    private CreditCard creditCard;

    public BankAccount(Double balance, Nominee nominee, CreditCard creditCard) {
        this.balance = balance;
        this.nominee = nominee;
        this.creditCard = creditCard;
    }

    public Optional<Nominee> getNominee() {
        return Optional.ofNullable(nominee);
    }

    public Optional<Double> getBalance() {
        return Optional.ofNullable(balance);
    }

    public Optional<CreditCard> getCreditCard() {
        return Optional.ofNullable(creditCard);
    }
}
