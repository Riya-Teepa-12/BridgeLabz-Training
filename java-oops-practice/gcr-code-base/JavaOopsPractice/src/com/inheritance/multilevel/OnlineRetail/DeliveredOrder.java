package com.inheritance.multilevel.OnlineRetail;

import java.time.LocalDate;

public class DeliveredOrder extends ShippedOrder{
       
	   private LocalDate deliveryDate ;
	   
	DeliveredOrder(int orderId , LocalDate orderDate , String trackingNumber ,LocalDate deliveryDate){
		 super(orderId , orderDate,trackingNumber);
		 this.deliveryDate = deliveryDate;
	}
	
	public void getOrderStatus() {
		super.getOrderStatus();
		System.out.println("The delivered date is"+deliveryDate);
	}
}
