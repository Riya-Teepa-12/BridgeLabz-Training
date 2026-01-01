package com.encapsulation.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.02;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied for ₹" + amount + " (Current Account)");
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 10;
    }

}
