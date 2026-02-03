package com.Day1.lambdaexpressions;

import java.util.*;
import java.util.function.BinaryOperator;

public class BasicLambdaExample {
    public static void main(String[] args) {

        // 1. Thread
        new Thread(() -> System.out.println("Thread running")).start();

        // 2. Print numbers
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        nums.forEach(System.out::println);

        // 3. Even / Odd
        nums.forEach(n ->
                System.out.println(n + " Even: " + (n % 2 == 0)));

        // 4. Add two numbers
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(10, 20));

        // 5. Greater of two numbers
        BinaryOperator<Integer> greater = (a, b) -> a > b ? a : b;
        System.out.println(greater.apply(15, 8));
    }
}
