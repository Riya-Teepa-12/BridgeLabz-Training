package com.day9.birdsanctuary;

public class UseEcoWing {

    public static void main(String[] args) {

        BirdSantuary sanctuary = new BirdSantuary();

        sanctuary.addBird(new Eagle("B1", "Rocky"));
        sanctuary.addBird(new Duck("B2", "Daisy"));
        sanctuary.addBird(new Penguin("B3", "Pingo"));
        sanctuary.addBird(new Kiwi("B4", "Kiki"));

        sanctuary.displayAllBirds();
        sanctuary.displayFlyingBirds();
        sanctuary.displaySwimmingBirds();
        sanctuary.sanctuaryReport();

        sanctuary.removeBirdById("B2");
        sanctuary.sanctuaryReport();
    }
}
