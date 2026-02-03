package com.Day1.optionalclassexamples.bankingapplication;

import java.util.Optional;

class Transaction {
    private String referenceNumber;

    public Transaction(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Optional<String> getReferenceNumber() {
        return Optional.ofNullable(referenceNumber);
    }
}
