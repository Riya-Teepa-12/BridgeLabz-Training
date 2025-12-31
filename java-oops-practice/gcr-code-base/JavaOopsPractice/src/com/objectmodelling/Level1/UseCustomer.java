package com.objectmodelling.Level1;

public class UseCustomer {
	public static void main(String[] args) {

	
	 CustomerDemo customer = new CustomerDemo(1, "Rohan");

     Product p1 = new Product(101, "Laptop", 55000);
     Product p2 = new Product(102, "Mouse", 1200);

     Order order = new Order(5001);

     order.addProduct(p1);
     order.addProduct(p2);

     order.showOrderDetails();
   }
}
