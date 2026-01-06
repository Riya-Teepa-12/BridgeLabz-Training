package com.day4.virtualpetacareapp;

public class Dog  extends Pet {

    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

   
    public void feed() {
        changeHunger(-25);
        changeMood(+15);
        System.out.println(name + " is eating happily ");
    }

  
    public void play() {
        changeEnergy(-20);
        changeMood(+20);
        System.out.println(name + " is playing fetch ");
    }

   
    public void sleep() {
        changeEnergy(+30);
        System.out.println(name + " is sleeping ");
    }

   
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

}
