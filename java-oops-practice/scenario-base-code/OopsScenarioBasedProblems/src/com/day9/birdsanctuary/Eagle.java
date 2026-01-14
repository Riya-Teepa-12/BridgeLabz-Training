package com.day9.birdsanctuary;

public class Eagle  extends Bird implements Flyable {

    public Eagle(String id, String name) {
        super(id, name, "Eagle");
    }

    public void fly() {
        System.out.println(getName() + " is flying high.");
    }

    public void displayInfo() {
        System.out.println("ID: " + getId() + ", Name: " + getName() +
                ", Species: Eagle, Ability: Fly");
    }

}
