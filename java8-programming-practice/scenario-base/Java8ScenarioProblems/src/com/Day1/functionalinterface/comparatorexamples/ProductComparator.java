package com.Day1.functionalinterface.comparatorexamples;

import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ProductComparator {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Laptop", 65000),
                new Product("Mobile", 30000)
        );

        products.sort(Comparator.comparingDouble(p -> p.price));

        products.forEach(p ->
                System.out.println(p.name + " - Price: " + p.price));
    }
}
