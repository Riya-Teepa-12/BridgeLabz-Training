package com.collections.votingsystem;

public class VotingApp {
      
	public static void main(String[] args) {

        CandidateVotes votingSystem = new CandidateVotes();

        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");

        votingSystem.displayVoteCount();
        votingSystem.displaySortedResults();
        votingSystem.displayVoteOrder();
    }
}
