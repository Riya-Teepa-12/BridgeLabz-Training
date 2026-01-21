package com.collectionsGenerics.dynamiconlinemarketplace;

public class Product<T extends Category> {
	private String productName;
    private double price;
    private T category;

    public Product(String productName, double price, T category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public T getCategory() {
        return category;
    }

    public void displayProduct() {
        System.out.println("Product: " + productName +
                ", Category: " + category.getName() +
                ", Price: ₹" + price);
    }
}
