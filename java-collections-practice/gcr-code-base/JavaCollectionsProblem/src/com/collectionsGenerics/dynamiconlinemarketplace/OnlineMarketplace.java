package com.collectionsGenerics.dynamiconlinemarketplace;

public class OnlineMarketplace {
	 public static void main(String[] args) {

	        Product<BookCategory> book =
	                new Product<>("Java Programming", 599.0, new BookCategory());

	        Product<ClothingCategory> shirt =
	                new Product<>("T-Shirt", 799.0, new ClothingCategory());

	        Product<GadgetCategory> phone =
	                new Product<>("Smartphone", 24999.0, new GadgetCategory());

	        ProductCatalog catalog = new ProductCatalog();
	        catalog.addProduct(book);
	        catalog.addProduct(shirt);
	        catalog.addProduct(phone);

	        System.out.println("---- Before Discount ----");
	        catalog.displayCatalog();

	        DiscountUtil.applyDiscount(book, 10);
	        DiscountUtil.applyDiscount(shirt, 20);
	        DiscountUtil.applyDiscount(phone, 5);

	        System.out.println("\n---- After Discount ----");
	        catalog.displayCatalog();
	    }
}
