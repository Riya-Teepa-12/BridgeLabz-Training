package com.inheritance.animalhierarchy;

public class Bird extends Animal{
	
	 Bird(String name, int age) {
	        super(name, age);
	    }
         public void makeSound() {
        	 System.out.println("Crew-Crew");
         }
}
