package com.exceptionalhandling;

import java.util.*;

class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String s) {
		super(s);
	}
}
public class BankTransactionSystem {
	private static  double balance =100;
  public static double withdrawalAmount(double amount) throws InsufficientBalanceException{
	  if (amount < 0) {
          throw new IllegalArgumentException("Invalid amount!");
      }

	  if(balance-amount<0) {
		  throw new InsufficientBalanceException("Insufficient balance!");
	  }
	  else {
		  balance -=amount;
	  }
	  return balance;
  }
  public static void main(String []args) {
	  Scanner kb = new Scanner(System.in);
	  try {
		  System.out.println("Enter the Amount :");
		  double amount = kb.nextInt();
		  double result = withdrawalAmount(amount);
		  System.out.println("Withdrawal successful, new balance: " + result);
	  }catch(InsufficientBalanceException ex) {
		  System.out.println("Insufficient balance!");
	  }catch(IllegalArgumentException ex) {
		  System.out.println("Invalid Input");
	  }
	  kb.close();
  }
	
}
