package com.day10.ballnballorganizer;


import java.util.*;

public class Bag implements Storable{
	  private String id;
	    private String color;
	    private int capacity;
	    private List<Ball> balls;

	    public Bag(String id, String color, int capacity) {
	        this.id = id;
	        this.color = color;
	        this.capacity = capacity;
	        this.balls = new ArrayList<>();
	    }

	    public String getId() {
	        return id;
	    }

	    public int getBallCount() {
	        return balls.size();
	    }

	    // Add ball (capacity check)
	    public void addBall(Ball ball) {
	        if (balls.size() >= capacity) {
	            System.out.println("Bag " + id + " is full! Cannot add ball.");
	            return;
	        }
	        balls.add(ball);
	        System.out.println("Ball added to Bag " + id);
	    }

	    // Remove ball by ID
	    public void removeBall(String ballId) {
	        Iterator<Ball> it = balls.iterator();
	        while (it.hasNext()) {
	            if (it.next().getId().equals(ballId)) {
	                it.remove();
	                System.out.println("Ball removed from Bag " + id);
	                return;
	            }
	        }
	        System.out.println("Ball not found in Bag " + id);
	    }

	    // Display balls
	    public void displayBalls() {
	        if (balls.isEmpty()) {
	            System.out.println("No balls in Bag " + id);
	            return;
	        }
	        for (Ball b : balls) {
	            System.out.println(b.getDescription());
	        }
	    }

	  
	    public String getDescription() {
	        return "Bag [ID=" + id + ", Color=" + color +
	               ", Capacity=" + capacity +
	               ", Balls=" + balls.size() + "]";
	    }
	}
	


