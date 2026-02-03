package com.Day1.lambdaexpressions;

import java.util.*;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return name + " | Price:" + price;
    }
}

public class ProductExample {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Laptop", 60000),
                new Product("Mouse", 500),
                new Product("Mobile", 30000)
        );

        // 1. 10% discount
        products.forEach(p ->
                System.out.println(p.getName() + " Discounted: " + p.getPrice() * 0.9));

        // 2. Sort by price
        products.sort((p1, p2) ->
                Double.compare(p1.getPrice(), p2.getPrice()));
        System.out.println(products);

        // 3. Free delivery
        products.forEach(p ->
                System.out.println(p.getName() + " Free Delivery: " +
                        (p.getPrice() > 500)));

        // 4. Final bill (price + 18% tax)
        products.forEach(p ->
                System.out.println(p.getName() + " Final Bill: " +
                        (p.getPrice() + p.getPrice() * 0.18)));

        // 5. Print names
        products.forEach(p -> System.out.println(p.getName()));
    }
}
