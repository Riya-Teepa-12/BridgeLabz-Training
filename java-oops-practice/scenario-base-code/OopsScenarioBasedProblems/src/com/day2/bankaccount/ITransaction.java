package com.day2.bankaccount;

public interface ITransaction {
	void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();

}
