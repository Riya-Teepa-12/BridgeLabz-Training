package com.Day1.functionalinterface.supplierexamples;

import java.util.function.Supplier;
import java.util.UUID;

public class StudentIDSupplier {
         
	 public static void main(String[] args) {

	        Supplier<String> studentIdSupplier =
	                () -> "STU-" + UUID.randomUUID().toString().substring(0, 8);

	        System.out.println("Student ID: " +
	                studentIdSupplier.get());
	    }
}
