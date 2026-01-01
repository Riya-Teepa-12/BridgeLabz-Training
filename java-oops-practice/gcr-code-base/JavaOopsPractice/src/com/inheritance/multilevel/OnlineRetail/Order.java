package com.inheritance.multilevel.OnlineRetail;

import java.time.LocalDate;

public class Order {
	
	//attributes
	private int orderId;
	private LocalDate orderDate;
	
	//contructor
	public Order(int orderId, LocalDate orderDate) {
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	
	public void getOrderStatus() {
		System.out.println("The Order Id is "+orderId);
		System.out.println("The order Date is"+orderDate);
	}
	
     
}
