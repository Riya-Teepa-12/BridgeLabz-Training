package com.inheritance.hierarchical.bankaccount;

public class UseBankAccount {
	
	 public static void main(String[] args) {

	        SavingAccount sa = new SavingAccount(101, 50000, 4.5);
	        sa.displayDetails();
	        sa.displayAccountType();

	        System.out.println();

	        CheckingAccount ca = new CheckingAccount(102, 30000, 5);
	        ca.displayDetails();
	        ca.displayAccountType();

	        System.out.println();

	        FixedDepositAccount fda = new FixedDepositAccount(103, 100000, 3);
	        fda.displayDetails();
	        fda.displayAccountType();
	    }

}
