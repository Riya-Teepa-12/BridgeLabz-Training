package com.Day10.gamingapp;

public class UseGamingApp {
	public static void main(String[] args) {

        AVLTree leaderboard = new AVLTree();

        // Insert Players
        leaderboard.insert(101, "Alice", 1200);
        leaderboard.insert(102, "Bob", 1500);
        leaderboard.insert(103, "Charlie", 1100);
        leaderboard.insert(104, "David", 1800);
        leaderboard.insert(105, "Eve", 1700);

        System.out.println("Initial Leaderboard:");
        leaderboard.printTopPlayers();

        // Update Bob
        System.out.println("\nUpdating Bob's Score...");
        leaderboard.delete(1500);
        leaderboard.insert(102, "Bob", 2000);

        System.out.println("After Update:");
        leaderboard.printTopPlayers();

        // Remove Charlie
        System.out.println("\nRemoving Charlie...");
        leaderboard.delete(1100);

        System.out.println("Final Leaderboard:");
        leaderboard.printTopPlayers();
    }
}
