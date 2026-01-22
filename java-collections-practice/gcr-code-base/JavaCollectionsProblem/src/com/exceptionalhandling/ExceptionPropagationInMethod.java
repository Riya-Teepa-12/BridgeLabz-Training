package com.exceptionalhandling;



public class ExceptionPropagationInMethod {
    public static void method1() {
    	int result = 10/0;
    }
    public static void method2() { 
          method1();
    }
    public static void main(String []args) {
    	try {
    		 method2();
    	}catch(ArithmeticException ex) {
    		System.out.println("Handled Exception in main");
    	}
     
    }
}
