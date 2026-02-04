package com.collections.shoppingcart;

import java.util.*;

public class ShoppingCart {

    private Map<String, Double> priceMap = new HashMap<>();
    private Map<String, Double> insertionOrderMap = new LinkedHashMap<>();

    // Add product to cart
    public void addProduct(String productName, double price) {
        priceMap.put(productName, price);
        insertionOrderMap.put(productName, price);
    }

    // Display products using HashMap
    public void displayProducts() {
        System.out.println("Products stored in HashMap");
        for (Map.Entry<String, Double> entry : priceMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // Display products in insertion order
    public void displayInsertionOrder() {
        System.out.println("Products in insertion order");
        for (Map.Entry<String, Double> entry : insertionOrderMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // Display products sorted by price using TreeMap
    public void displaySortedByPrice() {
        System.out.println("Products sorted by price");

        TreeMap<Double, List<String>> sortedMap = new TreeMap<>();

        for (Map.Entry<String, Double> entry : priceMap.entrySet()) {
            sortedMap
                .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                .add(entry.getKey());
        }

        for (Map.Entry<Double, List<String>> entry : sortedMap.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(product + " : " + entry.getKey());
            }
        }
    }
}