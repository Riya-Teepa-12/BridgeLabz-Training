package com.day7.artify;

public class PrintArt extends Artwork {

    public PrintArt(String title, String artist, double price,
                    String licenseType, String licensingTerms) {
        super(title, artist, price, licenseType, licensingTerms);
    }

    @Override
    public void purchase(User user) {
        user.deductBalance(price);
        System.out.println("Print art purchased: " + title);
    }

    @Override
    public void license() {
        System.out.println("Print Art License: Limited reproduction allowed");
    }

    @Override
    public void displayDetails() {
        System.out.println("Print Art: " + title + " by " + artist);
        System.out.println("Price: " + price);
    }
}
