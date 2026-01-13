package com.day8.gamebox;


import java.util.*;

public class User {
	
	  private String username;
	    private List<Game> ownedGames;

	    public User(String username) {
	        this.username = username;
	        this.ownedGames = new ArrayList<>();
	    }

	    public void buyGame(Game game) {
	        ownedGames.add(game);
	        System.out.println(username + " purchased " + game.getTitle());
	    }

	    // Protected data – no direct access
	    public List<Game> getOwnedGames() {
	        return Collections.unmodifiableList(ownedGames);
	    }

}
