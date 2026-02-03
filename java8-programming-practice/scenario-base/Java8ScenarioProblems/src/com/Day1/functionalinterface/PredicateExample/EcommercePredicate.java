package com.Day1.functionalinterface.PredicateExample;

import java.util.function.Predicate;

public class EcommercePredicate {
        
	public static void main(String[] args) {

        Predicate<Double> freeDelivery =
                amount -> amount >= 999;

        double orderAmount = 1200;
        System.out.println("Free delivery: " +
                freeDelivery.test(orderAmount));
    }
}
