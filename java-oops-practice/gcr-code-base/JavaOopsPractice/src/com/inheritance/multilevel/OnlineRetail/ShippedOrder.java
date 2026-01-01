package com.inheritance.multilevel.OnlineRetail;

import java.time.LocalDate;

public class ShippedOrder extends Order{
     private String trackingNumber;
      
     ShippedOrder(int orderId, LocalDate orderDate, String trackingNumber){
    	 super(orderId,orderDate);
    	 this.trackingNumber = trackingNumber;
     }
     
     public void getOrderStatus() {
    	 super.getOrderStatus();
    	 System.out.println("The tracking Number is :"+trackingNumber);
     }
}
