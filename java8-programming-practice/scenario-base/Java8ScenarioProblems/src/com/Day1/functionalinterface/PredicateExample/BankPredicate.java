package com.Day1.functionalinterface.PredicateExample;

import java.util.function.Predicate;

public class BankPredicate {
        
	 public static void main(String[] args) {

	        double balance = 50000;

	        Predicate<Double> validWithdrawal =
	                amount -> amount > 0 && amount <= balance;

	        double withdrawAmount = 20000;
	        System.out.println("Valid withdrawal: " +
	                validWithdrawal.test(withdrawAmount));
	    }
}
