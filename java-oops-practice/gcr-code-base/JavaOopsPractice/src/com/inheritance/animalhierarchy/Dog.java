package com.inheritance.animalhierarchy;

public class Dog extends Animal{
	
	 Dog(String name, int age) {
	        super(name, age);
	    }

	public void makeSound() {
   	 System.out.println("Bhow-Bhow");
    }
}
