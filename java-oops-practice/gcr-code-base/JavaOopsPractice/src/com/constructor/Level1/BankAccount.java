package com.constructor.Level1;

public class BankAccount {
	
	//attributes
	public int accountNumber;
	protected String accountHolder;
	private double balance;
	
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public BankAccount(int accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	

}
