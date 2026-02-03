package com.Day1.functionalinterface.functionExamples;

import java.util.function.Function;

public class DiscountFunction {
       
	 public static void main(String[] args) {

	        Function<Double, Double> discountedPrice =
	                price -> price - (price * 0.10);

	        double price = 2000;
	        System.out.println("Discounted Price: " +
	                discountedPrice.apply(price));
	    }
}
