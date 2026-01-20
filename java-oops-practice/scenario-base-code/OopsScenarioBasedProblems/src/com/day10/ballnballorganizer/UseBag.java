package com.day10.ballnballorganizer;

import java.util.*;

public class UseBag {
     
	 public static void main(String[] args) {

	        Bag bag1 = new Bag("B1", "Red", 2);
	        Bag bag2 = new Bag("B2", "Blue", 3);

	        Ball ball1 = new Ball("BALL1", "Yellow", "Small");
	        Ball ball2 = new Ball("BALL2", "Green", "Medium");
	        Ball ball3 = new Ball("BALL3", "Pink", "Large");

	        // Add balls
	        bag1.addBall(ball1);
	        bag1.addBall(ball2);
	        bag1.addBall(ball3); // should be rejected

	        // Display balls
	        System.out.println("\nBalls in Bag B1:");
	        bag1.displayBalls();

	        // Remove ball
	        bag1.removeBall("BALL1");

	        System.out.println("\nAfter removal:");
	        bag1.displayBalls();

	        // Display all bags
	        List<Bag> bags = Arrays.asList(bag1, bag2);

	        System.out.println("\nAll Bags Summary:");
	        for (Bag b : bags) {
	            System.out.println(b.getDescription());
	        }
	    }
	}

