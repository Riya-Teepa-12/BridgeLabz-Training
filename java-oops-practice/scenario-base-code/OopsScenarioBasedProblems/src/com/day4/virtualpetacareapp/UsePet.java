package com.day4.virtualpetacareapp;

public class UsePet {
	 public static void main(String[] args) {

	        Pet dog = new Dog("Buddy", 3);
	        Pet cat = new Cat("Luna", 2);
	        Pet bird = new Bird("Kiwi", 1);

	        dog.makeSound();
	        dog.play();
	        dog.feed();

	        cat.makeSound();
	        cat.sleep();

	        bird.makeSound();
	        bird.play();

	        System.out.println("\nDog Mood: " + dog.getMood());
	        System.out.println("Cat Energy: " + cat.getEnergy());
	        System.out.println("Bird Hunger: " + bird.getHunger());
	    }

}
