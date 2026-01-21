package com.Day9.tailorshop;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class TailorShop {
    
	public static void main(String []args) {
		OrderDetails od = new OrderDetails("Kurti",(LocalDate.of(2004, 12, 5)),(LocalTime.of(10, 5)));
		OrderDetails od1 = new OrderDetails("Jeans",(LocalDate.of(2003, 11, 5)),(LocalTime.of(10, 5)));
		OrderDetails od2 = new OrderDetails("Top",(LocalDate.of(2004, 10, 5)),(LocalTime.of(10, 5)));
		OrderDetails od3 = new OrderDetails("Skirt",(LocalDate.of(2004, 8, 5)),(LocalTime.of(10, 5)));
		OrderDetails od4 = new OrderDetails("Pant",(LocalDate.of(2004, 9, 5)),(LocalTime.of(10, 5)));
		
		List<OrderDetails> list = new ArrayList<>();
		  list.add(od);
		  list.add(od1);
		  list.add(od2);
		  list.add(od3);
		  list.add(od4);
		  
		List<OrderDetails> list2= OrderInsertionSort.sortOrder(list);
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i).getProductName()+" -> "+list2.get(i).getDeliveryDate()+" will be delivered "+(i+1));
		}
	}
}
