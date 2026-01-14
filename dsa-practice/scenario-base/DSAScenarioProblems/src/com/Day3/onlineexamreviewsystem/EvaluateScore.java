package com.Day3.onlineexamreviewsystem;

import java.util.*;

public class EvaluateScore {
  
	// Stack to track question navigation
    Stack<Integer> navigationStack = new Stack<>();

    // Map to store answers: questionId -> answer
    HashMap<Integer, String> answers = new HashMap<>();

    // Map for correct answers (for evaluation)
    HashMap<Integer, String> correctAnswers = new HashMap<>();

    // Constructor to initialize correct answers
    public EvaluateScore() {
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
    }

    // Track question navigation
    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // Store or update answer
    public void submitAnswer(int questionId, String answer) {
        answers.put(questionId, answer);
        System.out.println("Answer saved for Question " + questionId);
    }

    // Go back to previous question
    public int goBack() {
        if (navigationStack.isEmpty()) {
            System.out.println("No previous question");
            return -1;
        }
        return navigationStack.pop();
    }

    // Calculate score
    public int calculateScore() {
        int score = 0;

        for (int qId : correctAnswers.keySet()) {
            if (answers.containsKey(qId) &&
                answers.get(qId).equals(correctAnswers.get(qId))) {
                score++;
            }
        }
        return score;
    }

    // Submit exam
    public void submitExam() {
        int finalScore = calculateScore();
        System.out.println("Exam submitted!");
        System.out.println("Final Score: " + finalScore);
    }

 
}
