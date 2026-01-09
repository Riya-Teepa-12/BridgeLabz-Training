package com.day7.onlinelearningplatform;

public class Course {
	
	 private String title;
	    private Instructor instructor;
	    private double rating;              // encapsulated
	    private String[] modules;
	    private final String[] reviews;     // read-only internal reviews
	    private String level;               // Beginner / Advanced

	    // Constructor with default modules
	    public Course(String title, Instructor instructor, String level) {
	        this.title = title;
	        this.instructor = instructor;
	        this.level = level;
	        this.modules = new String[]{"Introduction", "Basics", "Summary"};
	        this.reviews = new String[]{"Good", "Very Helpful"};
	    }

	    // Constructor with custom modules
	    public Course(String title, Instructor instructor, String level, String[] modules) {
	        this.title = title;
	        this.instructor = instructor;
	        this.level = level;
	        this.modules = modules;
	        this.reviews = new String[]{"Excellent Content"};
	    }

	    // Encapsulation: rating logic protected
	    protected void updateRating(double newRating) {
	        if (newRating >= 0 && newRating <= 5) {
	            rating = (rating + newRating) / 2; // average logic
	        }
	    }

	    public double getRating() {
	        return rating;
	    }

	    // Read-only reviews
	    public String[] getReviews() {
	        return reviews.clone(); // prevents modification
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getLevel() {
	        return level;
	    }
}
