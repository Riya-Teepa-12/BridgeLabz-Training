package com.day8.gamebox;

public class StrategyGame extends Game {

    public StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

   
    public void playDemo() {
        System.out.println("Strategy Demo:  Plan moves and build tactics! ");
    }

}
