package com.collections.queueinterface;

import java.util.*;

public class BinaryUsingQueue {
	

    // Method to convert a number to binary using own logic
    public static String toBinary(int num) {
        String binary = "";

        while (num > 0) {
            int remainder = num % 2;
            binary = remainder + binary; 
            num = num / 2;
        }

        return binary;
    }

    // Method to generate first N binary numbers
    public static List<String> generateBinary(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            result.add(toBinary(i));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        List<String> binaryNumbers = generateBinary(n);

        System.out.println("First " + n + " binary numbers:");
        System.out.println(binaryNumbers);

        sc.close();
    }
}
