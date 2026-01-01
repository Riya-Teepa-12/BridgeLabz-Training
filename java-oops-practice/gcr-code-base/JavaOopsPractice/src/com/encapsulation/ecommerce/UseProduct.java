package com.encapsulation.ecommerce;

public class UseProduct {
	public static void main(String []args) {
		 Product laptop = new Electronics(101, "Laptop", 60000);
	        Product shirt = new Clothing(102, "T-Shirt", 1200);
	        Product rice = new Groceries(103, "Basmati Rice", 800);

	        displayProduct(laptop);
	        displayProduct(shirt);
	        displayProduct(rice);
	}
	public static void displayProduct(Product product) {
        product.displayProductDetails();
        System.out.println("Discount   : " + product.calculateDiscount());

        if (product instanceof Taxable) {
            Taxable taxable = (Taxable) product;
            System.out.println("Tax        : " + taxable.calculateTax());
            System.out.println(taxable.getTaxDetails());
        }else {
            System.out.println("Tax        : Not Applicable");
        }

        System.out.println("-----------------------------");
    }

}
