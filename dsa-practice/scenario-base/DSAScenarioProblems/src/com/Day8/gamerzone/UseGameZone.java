package com.Day8.gamerzone;

import java.util.*;

public class UseGameZone {
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Player> players = new ArrayList<>();

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();

        System.out.println("Enter player name and score:");
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            players.add(new Player(name, score));
        }

        GameZone.quickSort(players, 0, players.size() - 1);

        System.out.println("\nLeaderboard:");
        int rank = 1;
        for (Player p : players) {
            System.out.println("Rank " + rank++ + ": " + p);
        }

        sc.close();
    }
}
