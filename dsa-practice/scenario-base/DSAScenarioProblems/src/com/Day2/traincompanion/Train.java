package com.Day2.traincompanion;

public class Train {
    public static void main(String [] args) {
    	Compartment c = new Compartment();
    	c.addCompartment("Engine");
    	c.addCompartment("General");
    	c.addCompartment("Sleeper");
    	c.addCompartment("AC");
    	c.forward();
    	c.deleteCompartment("AC");
    	c.searchCompartment("Sleeper");
    	c.adjacentCompartment("General");
    	c.backward();
    }
}
