package com.Day8.movietime;

import java.util.*;

public class InsertionSort {
    public static List<ShowDetails> sortAccordingToTiming(List<ShowDetails> list){
    	 for (int i = 1; i < list.size(); i++) {
             ShowDetails key = list.get(i);
             int j = i - 1;

             while (j >= 0 && list.get(j).getTime().isAfter(key.getTime())) {
                 list.set(j + 1, list.get(j));
                 j--;
             }

             list.set(j + 1, key);
         }
         return list;
     }
}
