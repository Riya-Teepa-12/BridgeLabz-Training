package com.Day6.artexpro;

public class Art {
      
    public static void main(String[] args) {

        Artist[] artists = {
            new Artist("Alice", 120),
            new Artist("Bob", 60),
            new Artist("Charlie", 150),
            new Artist("Diana", 90)
        };

        System.out.println("Before Sorting:");
        for (Artist a : artists) {
            System.out.println(a);
        }

        ArtExpoInsertionSort.insertionSortByTime(artists);

        System.out.println("\nAfter Sorting by Registration Time:");
        for (Artist a : artists) {
            System.out.println(a);
        }
    }
}


