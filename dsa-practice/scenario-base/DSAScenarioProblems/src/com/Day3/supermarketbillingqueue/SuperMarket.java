package com.Day3.supermarketbillingqueue;

import java.util.*;

public class SuperMarket {
	
    public static void main(String[] args) {
          
       SuperCheckout sc = new SuperCheckout();
        // Initialize price & stock
        sc.priceMap.put("Milk", 50);
        sc.priceMap.put("Bread", 40);
        sc.priceMap.put("Eggs", 6);

        sc.stockMap.put("Milk", 20);
        sc.stockMap.put("Bread", 15);
        sc.stockMap.put("Eggs", 100);

        // Create customers
        Customer c1 = new Customer("Riya");
        c1.addItem("Milk", 2);
        c1.addItem("Bread", 1);

        Customer c2 = new Customer("Aman");
        c2.addItem("Eggs", 12);
        c2.addItem("Milk", 1);

        // Queue operations
        sc.addCustomer(c1);
        sc.addCustomer(c2);

        // Process checkout
        sc.processCustomer();
        sc.processCustomer();
    }


}
