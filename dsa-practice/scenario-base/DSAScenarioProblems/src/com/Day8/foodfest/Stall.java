package com.Day8.foodfest;

import java.util.*;

public class Stall {
	 String name;
	    int footfall;

	    public Stall(String name, int footfall) {
	        this.name = name;
	        this.footfall = footfall;
	    }

	
	    public String toString() {
	        return name + " (" + footfall + ")";
	    }
}
