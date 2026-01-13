package com.day8.gamebox;

public class UseGame {
	
	 public static void main(String[] args) {

	        Game arcade = new ArcadeGame("Speed Racer", 299, 4.5);
	        Game strategy = new StrategyGame("Empire Builder", 499, 4.8);

	        User user = new User("Prince");

	        arcade.playDemo();      
	        strategy.playDemo();

	        arcade.applyDiscount(20);   // Seasonal Offer
	        System.out.println("Discounted Price: " + arcade.getPrice());

	        user.buyGame(arcade);
	        arcade.download();
	    }

}
