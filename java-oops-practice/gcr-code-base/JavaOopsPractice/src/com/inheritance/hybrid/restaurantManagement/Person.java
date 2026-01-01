package com.inheritance.hybrid.restaurantManagement;

public class Person {
	
	//attributes
    private String name;
    private int id;
    
    //constructor
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
    

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
