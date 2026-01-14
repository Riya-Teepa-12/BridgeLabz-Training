package com.Day3.supermarketbillingqueue;

import java.util.*;

public class Customer {
	  String name;
	    HashMap<String, Integer> items; // itemName -> quantity

	    Customer(String name) {
	        this.name = name;
	        this.items = new HashMap<>();
	    }

	    void addItem(String itemName, int quantity) {
	        items.put(itemName, quantity);
	    }
}