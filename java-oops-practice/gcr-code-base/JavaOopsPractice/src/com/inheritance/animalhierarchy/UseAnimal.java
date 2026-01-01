package com.inheritance.animalhierarchy;

public class UseAnimal {
      public static void main(String []args) {
    	  Animal b = new Bird("peacock",10);
    	  System.out.println("The sound of Bird is ");
    	  b.makeSound();
    	  Animal c = new Cat("Kitto",2);
    	  System.out.println("The sound of Cat is ");
    	  c.makeSound();
    	  Animal d= new Dog("jerry",1);
    	  System.out.println("The sound of Dog is ");
    	  d.makeSound();
    	  
      }
}
