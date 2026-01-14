package com.Day3.onlineexamreviewsystem;

public class ExamProctor {
	
	
	// Main method for testing
    public static void main(String[] args) {
        EvaluateScore exam = new EvaluateScore();

        exam.visitQuestion(1);
        exam.submitAnswer(1, "A");

        exam.visitQuestion(2);
        exam.submitAnswer(2, "C");

        exam.visitQuestion(3);
        exam.submitAnswer(3, "C");

        exam.submitExam();
    }
}
