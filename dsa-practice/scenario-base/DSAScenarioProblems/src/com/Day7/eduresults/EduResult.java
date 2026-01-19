package com.Day7.eduresults;

import java.util.Arrays;
import java.util.*;

public class EduResult {
     private Student str;
	public static void main(String []args) {
		List<Student> distictA = Arrays.asList(
                new Student("Riya", 92,"Umaria"),
                new Student("Amit", 85,"Umaria")
        );
		List<Student> distictB = Arrays.asList(
                new Student("Siya", 92,"Katni"),
                new Student("Ram", 85,"Katni")
        );
		
		List<Student> result = EduResultMergeSort.mergeStudentsScore(distictA,distictB);

        System.out.println("Final State Rank List:");
        for (Student s : result) {
            System.out.println(s.getName()+ " - " + s.getScore()+" - "+s.getDistrict());
        }
	}
}
