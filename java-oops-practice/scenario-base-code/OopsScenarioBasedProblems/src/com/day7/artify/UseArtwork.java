package com.day7.artify;

public class UseArtwork {
	public static void main(String[] args) {

        // Create user
        User user = new User("Prince", 5000);

        // Create artworks
        Artwork art1 = new DigitalArt("Cyber Dreams", "Alex", 1200, "Digital");
        Artwork art2 = new PrintArt("Nature Bloom", "Sophia",
                                   2000, "Print", "Limited Prints Only");

        // Polymorphism
        art1.displayDetails();
        art1.license();
        art1.purchase(user);
        user.showBalance();

        System.out.println();

        art2.displayDetails();
        art2.license();
        art2.purchase(user);
        user.showBalance();
    }

}
