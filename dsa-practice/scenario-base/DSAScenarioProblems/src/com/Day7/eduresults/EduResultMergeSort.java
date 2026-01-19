package com.Day7.eduresults;

import java.util.*;

public class EduResultMergeSort {
	
   public static List<Student> mergeStudentsScore(List<Student> d1,List<Student> d2){
	   List<Student> result = new ArrayList<>();
       int i = 0, j = 0;

       while (i < d1.size() && j < d2.size()) {
           if (d1.get(i).getScore() >= d2.get(j).getScore()) {
               result.add(d1.get(i++)); 
           } else {
               result.add(d2.get(j++));
           }
       }

       while (i < d1.size()) result.add(d1.get(i++));
       while (j < d2.size()) result.add(d2.get(j++));
     
       return result;
   }
 }

