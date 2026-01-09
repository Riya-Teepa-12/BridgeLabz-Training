package com.day7.artify;

public abstract class Artwork implements IPurchasable{
	 
	protected String title;
    protected String artist;
    protected double price;
    protected String licenseType;

    // Protected licensing terms → encapsulation
    protected String licensingTerms;

    // Constructor without preview
    public Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
        this.licensingTerms = "Standard License";
    }

    // Constructor with preview
    public Artwork(String title, String artist, double price,
                   String licenseType, String licensingTerms) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
        this.licensingTerms = licensingTerms;
    }

    public abstract void displayDetails(); // Polymorphism

	

}
