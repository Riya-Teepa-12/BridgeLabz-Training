package com.Day7.flashdealz;

import java.util.*;

public class UseFlashDeal {
	 // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Product " + (i + 1));
            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Discount (%): ");
            double discount = sc.nextDouble();

            products[i] = new Product(id, discount);
        }

        // Sort using Quick Sort
        FlashDealQuickSort.quickSort(products, 0, n - 1);

        System.out.println("\nProducts sorted by highest discount:");
        for (Product p : products) {
            System.out.println("Product ID: " + p.id + " | Discount: " + p.discount + "%");
        }

        sc.close();
    }

}
