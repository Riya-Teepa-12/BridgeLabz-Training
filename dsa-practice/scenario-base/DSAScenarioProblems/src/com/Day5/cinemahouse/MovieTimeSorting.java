package com.Day5.cinemahouse;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;

public class MovieTimeSorting {
	
	 public void sortCinema(LocalTime arr[]) {
	   
	    for(int i=0;i<arr.length-1;i++) {
	    	for(int j=i;j<arr.length-1-i;j++) {
	    		if(arr[j].isAfter(arr[j+1])) {
	    			LocalTime temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
	    		}
	    	}
	    }
		 
	 }
}
