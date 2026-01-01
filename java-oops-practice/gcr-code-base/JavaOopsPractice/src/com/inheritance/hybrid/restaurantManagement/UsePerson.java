package com.inheritance.hybrid.restaurantManagement;

public class UsePerson {
     
	public static void main(String[] args) {

        Chef chef = new Chef("Ramesh", 101);
        Waiter waiter = new Waiter("Suresh", 201);

        chef.displayDetails();
        chef.performDuties();

        System.out.println();

        waiter.displayDetails();
        waiter.performDuties();
    }
}
