package com.Day1.functionalinterface.comparatorexamples;

import java.util.*;
class Student {
    
	 String name;
	    int rank;

	    Student(String name, int rank) {
	        this.name = name;
	        this.rank = rank;
	    }
}

public class StudentComparator {
     
	 public static void main(String[] args) {

	        List<Student> students = Arrays.asList(
	                new Student("Riya", 2),
	                new Student("Amit", 1)
	        );

	        students.sort(Comparator.comparingInt(s -> s.rank));

	        students.forEach(s ->
	                System.out.println(s.name + " - Rank: " + s.rank));
	    }
}
