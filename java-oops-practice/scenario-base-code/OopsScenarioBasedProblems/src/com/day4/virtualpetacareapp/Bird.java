package com.day4.virtualpetacareapp;

public class Bird  extends Pet {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    
    public void feed() {
        changeHunger(-15);
        changeMood(+10);
        System.out.println(name + " is eating seeds 🌾");
    }

  
    public void play() {
        changeEnergy(-10);
        changeMood(+20);
        System.out.println(name + " is flying around 🕊️");
    }

   
    public void sleep() {
        changeEnergy(+25);
        System.out.println(name + " is resting 💤");
    }

  
    public void makeSound() {
        System.out.println("Chirp! Chirp!");
    }
}


