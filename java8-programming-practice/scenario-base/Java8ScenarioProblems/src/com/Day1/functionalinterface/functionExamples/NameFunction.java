package com.Day1.functionalinterface.functionExamples;

import java.util.function.Function;

public class NameFunction {
      
	 public static void main(String[] args) {

	        Function<String, String> toUpperCase =
	                name -> name.toUpperCase();

	        String empName = "riya";
	        System.out.println("Uppercase Name: " +
	                toUpperCase.apply(empName));
	    }
}
