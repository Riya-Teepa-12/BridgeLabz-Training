package com.inheritance.multilevel.OnlineRetail;

import java.time.LocalDate;

public class UseOrder {
	public static void main(String []args) {
		
		
		LocalDate orderDate = LocalDate.of(2026,8,26);
		LocalDate deliveryDate = LocalDate.of(2026,9,10);
		 Order o1 = new Order(101, orderDate);
	        ShippedOrder o2 = new ShippedOrder(102, orderDate, "TRK12345");
	        DeliveredOrder o3 = new DeliveredOrder(103, orderDate, "TRK67890", deliveryDate);

	        o1.getOrderStatus();
	        System.out.println("---------------");
	        o2.getOrderStatus();
	        System.out.println("---------------");
	        o3.getOrderStatus();
	}

}
