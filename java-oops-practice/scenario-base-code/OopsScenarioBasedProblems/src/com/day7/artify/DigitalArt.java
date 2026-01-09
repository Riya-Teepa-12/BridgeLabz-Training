package com.day7.artify;

public class DigitalArt  extends Artwork {

    public DigitalArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
    }

    
    public void purchase(User user) {
        // Deduct wallet balance using operators
        user.deductBalance(price);
        System.out.println("Digital art purchased: " + title);
    }

   
    public void license() {
        System.out.println("Digital Art License: Personal & Commercial use");
    }

   
    public void displayDetails() {
        System.out.println("Digital Art: " + title + " by " + artist);
        System.out.println("Price: " + price);
    }
}


