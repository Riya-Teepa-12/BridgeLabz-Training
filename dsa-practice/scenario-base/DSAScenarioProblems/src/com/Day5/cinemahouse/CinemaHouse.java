package com.Day5.cinemahouse;


import java.util.*;
import java.time.LocalTime;
public class CinemaHouse {
	public static void main(String []args) {
	 
	 LocalTime []add= {
			 LocalTime.of(4, 38, 45),   
			    LocalTime.of(10, 30, 15),
			    LocalTime.of(11, 4, 45),  
			    LocalTime.of(10, 8, 15)
		};
		System.out.println("Before sorting");
		for(LocalTime t:add) {
			System.out.println(t);
		}
		 
		MovieTimeSorting ml = new MovieTimeSorting();
		ml.sortCinema(add);
		System.out.println("After sorting");
		for(LocalTime t:add) {
			System.out.println(t);
		}
		
	}
  }

