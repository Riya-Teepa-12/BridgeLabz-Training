package com.Day1.functionalinterface.consumerexamples;

import java.util.function.Consumer;
import java.time.LocalDateTime;


public class EmployeeLoginConsumer {
     
	 public static void main(String[] args) {

	        Consumer<String> logLogin =
	                empName -> System.out.println(
	                        empName + " logged in at " + LocalDateTime.now());

	        logLogin.accept("Amit");
	    }
}
