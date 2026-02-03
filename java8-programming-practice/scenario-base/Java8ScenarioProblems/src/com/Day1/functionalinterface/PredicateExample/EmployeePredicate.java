package com.Day1.functionalinterface.PredicateExample;

import java.util.function.Predicate;

public class EmployeePredicate {
	public static void main(String[] args) {

        Predicate<Double> highSalary =
                salary -> salary > 30000;

        double salary = 45000;
        System.out.println("Salary > 30000: " +
                highSalary.test(salary));
    }
}
