package com.day7.onlinelearningplatform;

public class Student  extends User implements ICertifiable {

    private double progress;   // percentage
    private int score;

    public Student(String name, String email) {
        super(name, email);
        this.progress = 0;
        this.score = 0;
    }

    public void updateProgress(double value) {
        progress += value;
    }

    public void addScore(int marks) {
        score += marks; 
    }

    public double getProgress() {
        return progress;
    }

    public void generateCertificate() {
        if (progress >= 100 && score >= 60) {
            System.out.println("Certificate Generated for Student: " + name);
        } else {
            System.out.println("Course not completed yet.");
        }
    }
	
	
}
