package com.constructor.Level1;

public class Product {
	
	//attributes
	
	private String productName;
	private double price;
	
	//class variable
	static int total_counts=0;

	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
		total_counts++;
	}
	
	// Instance method
   public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }

    // Class (static) method
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + total_counts);
    }

    // Main method for testing
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mobile", 20000);

        p1.displayProductDetails();
        System.out.println();

        p2.displayProductDetails();
        System.out.println();

        Product.displayTotalProducts();
	
    }

}
