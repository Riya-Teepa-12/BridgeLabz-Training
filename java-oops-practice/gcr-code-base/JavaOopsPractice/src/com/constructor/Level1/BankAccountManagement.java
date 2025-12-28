package com.constructor.Level1;

public class BankAccountManagement {
	
	public static void main(String[] args) {

        SavingsAccount saving= new SavingsAccount(
                123456,
                "Prince",
                25000.0,
                4.5
        );

        saving.displayAccountDetails();

        // Modifying private balance using setter
        saving.setBalance(30000.0);
        System.out.println("Updated Balance: " + saving.getBalance());
    }

}
