package com.Day1.functionalinterface.comparatorexamples;

import java.util.*;

public class StringLengthComparator {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Java", "SpringBoot", "API");

        names.sort(Comparator.comparingInt(String::length));

        System.out.println(names);
    }
}
