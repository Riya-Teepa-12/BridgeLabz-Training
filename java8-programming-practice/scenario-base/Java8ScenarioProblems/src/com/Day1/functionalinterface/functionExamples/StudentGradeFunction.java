package com.Day1.functionalinterface.functionExamples;

import java.util.function.Function;

public class StudentGradeFunction {
       
	 public static void main(String[] args) {

	        Function<Integer, String> gradeFunction = marks -> {
	            if (marks >= 75) return "A";
	            else if (marks >= 60) return "B";
	            else return "C";
	        };

	        int marks = 68;
	        System.out.println("Grade: " + gradeFunction.apply(marks));
	    }
}
