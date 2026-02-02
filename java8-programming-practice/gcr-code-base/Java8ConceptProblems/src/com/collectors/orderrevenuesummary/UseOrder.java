package com.collectors.orderrevenuesummary;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseOrder {
	  public static void main(String[] args) {

	        List<Order> orders = Arrays.asList(
	                new Order("Riya", 2500.50),
	                new Order("Aman", 1800.00),
	                new Order("Riya", 1200.00),
	                new Order("Neha", 3000.00),
	                new Order("Aman", 700.00)
	        );

	        // Sum order totals per customer
	        Map<String, Double> revenuePerCustomer =
	                orders.stream()
	                        .collect(Collectors.groupingBy(
	                                Order::getCustomerName,
	                                Collectors.summingDouble(Order::getAmount)
	                        ));

	        System.out.println(revenuePerCustomer);
	    }
	}

