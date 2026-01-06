package com.day4.virtualpetacareapp;

public class Cat  extends Pet {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

   
    public void feed() {
        changeHunger(-20);
        changeMood(+10);
        System.out.println(name + " is eating fish ");
    }

    
    public void play() {
        changeEnergy(-15);
        changeMood(+15);
        System.out.println(name + " is playing with yarn ");
    }

  
    public void sleep() {
        changeEnergy(+40);
        System.out.println(name + " is napping ");
    }

   
    public void makeSound() {
        System.out.println("Meow!");
    }

}
