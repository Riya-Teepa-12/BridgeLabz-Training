package com.day9.birdsanctuary;

public class Kiwi extends Bird {

    public Kiwi(String id, String name) {
        super(id, name, "Kiwi");
    }

    public void displayInfo() {
        System.out.println("ID: " + getId() + ", Name: " + getName() +
                ", Species: Kiwi, Ability: Neither Fly nor Swim");
    }


}
