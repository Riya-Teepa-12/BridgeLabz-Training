package com.Day1.functionalinterface.PredicateExample;

import java.util.function.Predicate;

public class StudentPredicate {
	public static void main(String[] args) {

        Predicate<Integer> isEligibleForExam =
                attendance -> attendance >= 75;

        int attendance = 80;
        System.out.println("Eligible for exam: " +
                isEligibleForExam.test(attendance));
    }
}
