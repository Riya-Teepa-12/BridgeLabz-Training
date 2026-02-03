package com.Day1.functionalinterface.supplierexamples;

import java.util.function.Supplier;

public class WelcomeSupplier {
     
	public static void main(String[] args) {

        Supplier<String> welcomeMessage =
                () -> "Welcome to our application!";

        System.out.println(welcomeMessage.get());
    }
}
