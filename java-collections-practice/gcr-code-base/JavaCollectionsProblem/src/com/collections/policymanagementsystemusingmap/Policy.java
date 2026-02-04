package com.collections.policymanagementsystemusingmap;

import java.time.LocalDate;

class Policy {
    String policyNumber;
    String policyHolderName;
    LocalDate expiryDate;
    double premium;

    public Policy(String policyNumber, String policyHolderName, LocalDate expiryDate, double premium) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.premium = premium;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyHolderName='" + policyHolderName + '\'' +
                ", expiryDate=" + expiryDate +
                ", premium=" + premium +
                '}';
    }
}