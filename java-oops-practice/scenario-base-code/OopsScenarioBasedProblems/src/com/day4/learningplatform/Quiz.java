package com.day4.learningplatform;

public class Quiz {
	// internal question bank must remain private
    private String[] questions;
    private final String[] answers;   // answers cannot be modified
    private int score;
    private String difficulty;

    // Constructor with difficulty level
    public Quiz(String[] questions, String[] answers, String difficulty) {
        this.questions = questions;
        this.answers = answers;
        this.difficulty = difficulty;
        this.score = 0;
    }

    // Overloaded constructor (default difficulty)
    public Quiz(String[] questions, String[] answers) {
        this(questions, answers, "Medium");
    }

    // Only getter, no setter → encapsulation
    public String[] getAnswers() {
        return answers;
    }

    public int getScore() {
        return score;
    }

    // Scoring using operators
    public void evaluate(String[] userAnswers) {
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equalsIgnoreCase(userAnswers[i])) {
                score += 1; // operator usage
            }
        }
    }

    public double calculatePercentage() {
        return (score * 100.0) / answers.length; // arithmetic operators
    }
}
