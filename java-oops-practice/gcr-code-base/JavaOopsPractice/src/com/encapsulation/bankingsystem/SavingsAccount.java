package com.encapsulation.bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable{
	 private static final double INTEREST_RATE = 0.04;

	    public SavingsAccount(String accountNumber, String holderName, double balance) {
	        super(accountNumber, holderName, balance);
	    }

	    @Override
	    public double calculateInterest() {
	        return balance * INTEREST_RATE;
	    }

	    @Override
	    public void applyForLoan(double amount) {
	        System.out.println("Loan applied for ₹" + amount + " (Savings Account)");
	    }

	    @Override
	    public double calculateLoanEligibility() {
	        return balance * 5;
	    }
}
