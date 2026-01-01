package com.encapsulation.bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class UseBankAccount {
	 public static void main(String[] args) {
	 List<BankAccount> accounts = new ArrayList<>();

     accounts.add(new SavingsAccount("SB101", "Prince", 50000));
     accounts.add(new CurrentAccount("CA201", "Rahul", 100000));

     for (BankAccount account : accounts) {

         account.displayAccountDetails();
         account.deposit(5000);
         account.withdraw(3000);

        
         System.out.println("Interest : ₹" + account.calculateInterest());

      
         if (account instanceof Loanable) {
             Loanable loanAccount = (Loanable) account;
             loanAccount.applyForLoan(200000);
             System.out.println("Loan Eligibility : ₹" + loanAccount.calculateLoanEligibility());
         }

         System.out.println("---------------------------------");
     }
 }
}
