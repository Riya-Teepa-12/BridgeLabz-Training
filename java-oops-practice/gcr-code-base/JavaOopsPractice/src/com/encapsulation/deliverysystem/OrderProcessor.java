package com.encapsulation.deliverysystem;

public class OrderProcessor {
	 public static void processOrder(FoodItem item) {
	        item.getItemDetails();
	        double total = item.calculateTotalPrice();
	        System.out.println("Total Price: ₹" + total);

	        if (item instanceof Discountable) {
	            Discountable d = (Discountable) item;
	            System.out.println("Discount   : ₹" + d.applyDiscount());
	            System.out.println(d.getDiscountDetails());
	        }

	        System.out.println("------------------------------");
	    }
}
