package com.functionalinterfaces.stringlengthchecker;

import java.util.function.Function;

public class UseMessage {
	public static void main(String[] args) {

        Message msg =new Message("This is a test message for checking character length.");

        // Function to calculate string length
        Function<String, Integer> lengthFunction=String::length;

        MessageLengthService.checkLength(msg, lengthFunction);
    }

}
