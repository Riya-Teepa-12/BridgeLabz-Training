package com.inheritance.animalhierarchy;

public class Cat extends Animal {
       
	
	 Cat(String name, int age) {
	        super(name, age);
	    }
	
	public void makeSound() {
   	 System.out.println("Meow-Meow");
    }
}
