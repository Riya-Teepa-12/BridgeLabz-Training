package com.annotation;

//Parent class
class Animal {
 // Method to be overridden
 public void makeSound() {
     System.out.println("Some generic animal sound");
 }
}

//Child class
class Dog extends Animal {
 // Overriding the makeSound() method
 @Override
 public void makeSound() {
     System.out.println("Woof! Woof!");
 }
}

//Main class to test
public class UseAnimal {
 public static void main(String[] args) {
     Dog dog = new Dog();  
     dog.makeSound();      
 }
}

