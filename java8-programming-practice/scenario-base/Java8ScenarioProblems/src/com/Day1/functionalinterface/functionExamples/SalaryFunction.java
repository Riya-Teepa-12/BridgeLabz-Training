package com.Day1.functionalinterface.functionExamples;

import java.util.function.Function;

public class SalaryFunction {
    
	 public static void main(String[] args) {

	        Function<Double, Double> annualSalary =
	                monthlySalary -> monthlySalary * 12;

	        double monthlySalary = 40000;
	        System.out.println("Annual Salary: " +
	                annualSalary.apply(monthlySalary));
	    }
}
