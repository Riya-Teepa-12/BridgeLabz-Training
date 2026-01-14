package com.day9.birdsanctuary;

public class Penguin extends Bird implements Swimmable {

    public Penguin(String id, String name) {
        super(id, name, "Penguin");
    }

    public void swim() {
        System.out.println(getName() + " swims very fast.");
    }

    public void displayInfo() {
        System.out.println("ID: " + getId() + ", Name: " + getName() +
                ", Species: Penguin, Ability: Swim");
    }

}
