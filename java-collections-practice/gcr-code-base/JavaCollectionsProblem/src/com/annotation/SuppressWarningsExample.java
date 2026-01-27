package com.annotation;

import java.util.ArrayList;

public class SuppressWarningsExample {
	 @SuppressWarnings("unchecked") // Suppresses unchecked warnings
	    public static void main(String[] args) {
	        // Creating a raw ArrayList (without generics)
	        ArrayList list = new ArrayList();

	        // Adding elements of different types
	        list.add("Hello");
	        list.add(123);
	        list.add(45.67);

	        // Retrieving elements (needs casting)
	        String str = (String) list.get(0);
	        int num = (Integer) list.get(1);
	        double d = (Double) list.get(2);

	        System.out.println("String: " + str);
	        System.out.println("Integer: " + num);
	        System.out.println("Double: " + d);
	    }
}
