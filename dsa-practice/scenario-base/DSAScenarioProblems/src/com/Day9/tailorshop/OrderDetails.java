package com.Day9.tailorshop;

import java.time.LocalDate;
import java.time.LocalTime ;

public class OrderDetails {
	
	private String productName;
    private LocalDate deliveryDate;
    private LocalTime hour;
    
    public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public LocalTime getHour() {
		return hour;
	}
	public void setHour(LocalTime hour) {
		this.hour = hour;
	}
	
	public OrderDetails(String productName, LocalDate deliveryDate, LocalTime hour) {
		this.productName = productName;
		this.deliveryDate = deliveryDate;
		this.hour = hour;
	}
    
}
