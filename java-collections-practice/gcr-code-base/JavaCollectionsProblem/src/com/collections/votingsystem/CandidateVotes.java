package com.collections.votingsystem;

import java.util.*;

public class CandidateVotes {
	// Stores total votes per candidate
    private HashMap<String, Integer> voteCount;

    // Maintains order in which votes are cast
    private LinkedHashMap<Integer, String> voteOrder;

    private int voteId;

    public CandidateVotes() {
        voteCount = new HashMap<>();
        voteOrder = new LinkedHashMap<>();
        voteId = 1;
    }

    // Cast a vote
    public void castVote(String candidate) {
        // Update vote count
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);

        // Maintain vote order
        voteOrder.put(voteId++, candidate);

        System.out.println("Vote cast for: " + candidate);
    }

    // Display vote counts (unordered)
    public void displayVoteCount() {
        System.out.println("\nVote Count (HashMap):");
        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    // Display sorted results
    public void displaySortedResults() {
        TreeMap<String, Integer> sortedResults = new TreeMap<>(voteCount);

        System.out.println("\nSorted Results (TreeMap):");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    // Display order of votes
    public void displayVoteOrder() {
        System.out.println("\nVote Casting Order (LinkedHashMap):");
        for (Map.Entry<Integer, String> entry : voteOrder.entrySet()) {
            System.out.println("Vote #" + entry.getKey() + " → " + entry.getValue());
        }
    }
}
