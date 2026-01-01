package com.inheritance.hybrid.restaurantManagement;

public class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    
    public void performDuties() {
        System.out.println("Chef is preparing meals and managing the kitchen.");
    }

}
