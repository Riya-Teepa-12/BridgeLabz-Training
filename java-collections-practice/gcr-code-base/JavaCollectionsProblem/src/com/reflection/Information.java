package com.reflection;

import java.lang.reflect.*;
import java.util.Scanner;

public class Information {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter class name (e.g. java.util.ArrayList): ");
	        String className = sc.nextLine();

	        try {
	            Class<?> cls = Class.forName(className);
                System.out.println("\nClass Name: " + cls.getName());
                System.out.println("\n--- Fields ---");
	            Field[] fields = cls.getDeclaredFields();
	            for (Field field : fields) {
	                System.out.println(field);
	             }
                System.out.println("\n--- Constructors ---");
	            Constructor<?>[] constructors = cls.getDeclaredConstructors();
	            for (Constructor<?> constructor : constructors) {
	                System.out.println(constructor);
	            }
	            
	            System.out.println("\n--- Methods ---");
	            Method[] methods = cls.getDeclaredMethods();
	            for (Method method : methods) {
	                System.out.println(method);
	            }

	        } catch (ClassNotFoundException e) {
	            System.out.println("Class not found! Please enter a valid class name.");
	        }
	    }
}
