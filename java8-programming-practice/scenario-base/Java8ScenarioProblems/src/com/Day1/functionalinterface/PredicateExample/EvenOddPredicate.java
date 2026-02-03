package com.Day1.functionalinterface.PredicateExample;

import java.util.function.Predicate;

public class EvenOddPredicate {
	 public static void main(String[] args) {

	        Predicate<Integer> isEven =
	                number -> number % 2 == 0;

	        int num = 10;
	        System.out.println("Is Even: " +
	                isEven.test(num));
	    }
}
