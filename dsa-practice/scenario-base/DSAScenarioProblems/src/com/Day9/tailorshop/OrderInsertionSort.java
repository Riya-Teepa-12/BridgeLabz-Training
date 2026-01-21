package com.Day9.tailorshop;

import java.util.*;

public class OrderInsertionSort {
    
	public static List<OrderDetails> sortOrder(List<OrderDetails> order){
		   for(int i=0;i<order.size()-1;i++) {
			   for(int j=1;j<order.size();j++) {
				   OrderDetails d = order.get(j);
				   OrderDetails d1 = order.get(j-1);
				   if(d1.getDeliveryDate().isAfter(d.getDeliveryDate())) {
					   order.set(j,d1);
					   order.set(j-1,d);
				   }
			   }
		   }
		return order;  
	}
}
