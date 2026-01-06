package com.day4.learningplatform;

public class UseUser {
	 public static void main(String[] args) {

	        Learner learner = new Learner(
	                "Prince",
	                "prince@gmail.com",
	                101,
	                true
	        );

	        String[] questions = {
	                "What is OOP?",
	                "What is inheritance?"
	        };

	        String[] answers = {
	                "Object Oriented Programming",
	                "Reusability"
	        };

	        Quiz quiz = new Quiz(questions, answers, "Easy");

	        String[] userAnswers = {
	                "Object Oriented Programming",
	                "Reusability"
	        };

	        quiz.evaluate(userAnswers);

	        System.out.println("Score: " + quiz.getScore());
	        System.out.println("Percentage: " + quiz.calculatePercentage() + "%");

	    
	        learner.generateCertificate();
	    }

}
