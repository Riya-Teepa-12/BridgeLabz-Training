package com.day9.birdsanctuary;

public class Duck extends Bird implements Flyable, Swimmable {

    public Duck(String id, String name) {
        super(id, name, "Duck");
    }

    public void fly() {
        System.out.println(getName() + " can fly short distances.");
    }

    public void swim() {
        System.out.println(getName() + " swims in water.");
    }

    public void displayInfo() {
        System.out.println("ID: " + getId() + ", Name: " + getName() +
                ", Species: Duck, Ability: Fly & Swim");
    }

}
