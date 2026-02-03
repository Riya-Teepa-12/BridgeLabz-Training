package com.Day1.functionalinterface.consumerexamples;

import java.util.function.Consumer;

public class BankConsumer {
        
	 public static void main(String[] args) {

	        Consumer<Double> showBalance =
	                balance -> System.out.println(
	                        "Available Balance: ₹" + balance);

	        showBalance.accept(35000.50);
	    }
} 
