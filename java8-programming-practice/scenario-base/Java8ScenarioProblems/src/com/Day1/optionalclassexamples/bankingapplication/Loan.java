package com.Day1.optionalclassexamples.bankingapplication;

public class Loan {
    private String loanType;
    private double loanAmount;

    public Loan(String loanType, double loanAmount) {
        this.loanType = loanType;
        this.loanAmount = loanAmount;
    }

    public String getLoanType() {
        return loanType;
    }

    public double getLoanAmount() {
        return loanAmount;
    }
}
