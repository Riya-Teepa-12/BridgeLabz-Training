package com.collectors.studentresultgrouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseStudent {
      
	 public static void main(String[] args) {

	        List<Student> students = Arrays.asList(
	                new Student("Riya", "A"),
	                new Student("Aman", "B"),
	                new Student("Neha", "A"),
	                new Student("Rahul", "C"),
	                new Student("Priya", "B")
	        );

	        // Group students by grade and collect names
	        Map<String, List<String>> result =
	                students.stream()
	                        .collect(Collectors.groupingBy(
	                                Student::getGrade,
	                                Collectors.mapping(Student::getName, Collectors.toList())
	                        ));

	        System.out.println(result);
	    }
} 
