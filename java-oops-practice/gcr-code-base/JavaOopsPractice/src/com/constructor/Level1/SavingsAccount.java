package com.constructor.Level1;

public class SavingsAccount extends BankAccount{
	
    private double interestRate;
	//constructor
	public SavingsAccount(int accountNumber, String accountHolder,
            double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
         this.interestRate = interestRate;
   }
	
	public void displayAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number (Public): " + accountNumber);
        System.out.println("Account Holder (Protected): " + accountHolder);
        System.out.println("Balance (via public method): " + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
    }
	

}
