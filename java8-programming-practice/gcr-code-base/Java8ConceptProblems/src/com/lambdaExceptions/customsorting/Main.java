package com.lambdaExceptions.customsorting;

import java.util.*;

public class Main {
   
	 public static void main(String[] args) {

	        List<Product> products = new ArrayList<>();

	        products.add(new Product(101, "Laptop", 60000, 4.5, 10));
	        products.add(new Product(102, "Mobile", 30000, 4.7, 20));
	        products.add(new Product(103, "Headphones", 3000, 4.2, 30));
	        products.add(new Product(104, "Camera", 45000, 4.6, 15));

	    
	        CampaignType campaign = CampaignType.RATING;

	        UseProductSorter.sortProducts(products, campaign);

	        products.forEach(System.out::println);
	    }
}
