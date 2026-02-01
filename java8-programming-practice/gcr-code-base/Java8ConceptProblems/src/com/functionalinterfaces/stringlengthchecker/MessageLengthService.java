package com.functionalinterfaces.stringlengthchecker;

import java.util.function.Function;

public class MessageLengthService {
	 private static final int MAX_LIMIT = 160;

	    public static void checkLength(
	            Message message,Function<String, Integer> lengthFunction) {

	        int length = lengthFunction.apply(message.getContent());

	        if (length > MAX_LIMIT) {
	            System.out.println("Message exceeds limit: " + length + " characters");
	        } else {
	            System.out.println("Message within limit: " + length + " characters");
	        }
	    }

}
