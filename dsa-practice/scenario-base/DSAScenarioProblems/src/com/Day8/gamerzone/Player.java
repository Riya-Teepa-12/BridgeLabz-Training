package com.Day8.gamerzone;

import java.util.*;

public class Player {
    
	String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

 
    public String toString() {
        return name + " -> " + score;
    }
}
