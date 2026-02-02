package com.streams.transformingnames;

import java.util.Arrays;
import java.util.List;

public class TransformingNamesForDisplay {
	public static void main(String[] args){
        List<String> customers=Arrays.asList(
            "rahul",
            "amit",
            "neha",
            "priya",
            "karan"
        );

        customers.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
    }
}
