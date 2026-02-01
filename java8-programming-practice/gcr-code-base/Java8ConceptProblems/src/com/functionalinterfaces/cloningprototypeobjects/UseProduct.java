package com.functionalinterfaces.cloningprototypeobjects;

public class UseProduct {
	public static void main(String[] args) {

        Product original = new Product(101, "Laptop", 60000);

        try {
            Product clone = (Product) original.clone();

            System.out.println("Original Product: " + original);
            System.out.println("Cloned Product: " + clone);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
