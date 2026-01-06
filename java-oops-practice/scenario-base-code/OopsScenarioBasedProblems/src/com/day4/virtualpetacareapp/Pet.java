package com.day4.virtualpetacareapp;

import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    // Encapsulated internal states
    private int hunger; // 0 = full, 100 = very hungry
    private int energy; // 0 = tired, 100 = energetic
    private int mood;   // 0 = sad, 100 = happy

    // Constructor with random default values
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        Random r = new Random();
        this.hunger = r.nextInt(41) + 30;
        this.energy = r.nextInt(41) + 30;
        this.mood = r.nextInt(41) + 30;
    }

    // Constructor with user-specified values
    public Pet(String name, String type, int age, int hunger, int energy, int mood) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.energy = energy;
        this.mood = mood;
    }

    // Controlled modifiers (operators logic)
    protected void changeHunger(int value) {
        hunger = Math.max(0, Math.min(100, hunger + value));
    }

    protected void changeEnergy(int value) {
        energy = Math.max(0, Math.min(100, energy + value));
    }

    protected void changeMood(int value) {
        mood = Math.max(0, Math.min(100, mood + value));
    }

    // Read-only access
    public int getHunger() { return hunger; }
    public int getEnergy() { return energy; }
    public int getMood() { return mood; }

    // Polymorphic behavior
    public abstract void makeSound();

}
