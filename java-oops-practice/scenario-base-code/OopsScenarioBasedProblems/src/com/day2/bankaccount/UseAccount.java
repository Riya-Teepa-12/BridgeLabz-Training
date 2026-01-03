package com.day2.bankaccount;

import java.util.*;

public class UseAccount {
	 public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        Account account = null;

	        System.out.println("===== Welcome to MyBank =====");
	        System.out.println("1. Savings Account");
	        System.out.println("2. Current Account");
	        System.out.print("Choose Account Type: ");
	        int choice = input.nextInt();

	        System.out.print("Enter Account Number: ");
	        int accNo = input.nextInt();

	        System.out.print("Enter Opening Balance: ");
	        double balance = input.nextDouble();

	        if (choice == 1) {
	            account = new SavingsAccount(accNo, balance);
	        } else if (choice == 2) {
	            account = new CurrentAccount(accNo, balance);
	        } else {
	            System.out.println("Invalid Account Type");
	            return;
	        }

	        int option;
	        do {
	            System.out.println("\n---- Menu ----");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Calculate Interest");
	            System.out.println("5. Exit");
	            System.out.print("Choose an option: ");
	            option = input.nextInt();

	            switch (option) {
	                case 1:
	                    System.out.print("Enter deposit amount: ");
	                    account.deposit(input.nextDouble());
	                    break;

	                case 2:
	                    System.out.print("Enter withdrawal amount: ");
	                    account.withdraw(input.nextDouble());
	                    break;

	                case 3:
	                    account.checkBalance();
	                    break;

	                case 4:
	                    System.out.println("Interest Amount: ₹" + account.calculateInterest());
	                    break;

	                case 5:
	                    System.out.println("Thank you for banking with MyBank!");
	                    break;

	                default:
	                    System.out.println("Invalid option");
	            }
	        } while (option != 5);

	        input.close();
	    }
}
