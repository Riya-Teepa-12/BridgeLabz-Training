package com.day8.gamebox;

import java.util.*;

public class Game implements IDownloadable {
    private String title;
    private String genre;
    protected double price;
    private double rating;

    // Constructor for Paid game
    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    // Constructor for free game
    public Game(String title, String genre, double rating) {
        this(title, genre, 0.0, rating);
    }

    // Seasonal offer (operator-like behavior)
    public double applyDiscount(double percent) {
        price = price - (price * percent / 100);
        return price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    
    public void download() {
        System.out.println(title + " downloaded successfully.");
    }

    
    public void playDemo() {
        System.out.println("Playing generic demo for " + title);
    }

}
