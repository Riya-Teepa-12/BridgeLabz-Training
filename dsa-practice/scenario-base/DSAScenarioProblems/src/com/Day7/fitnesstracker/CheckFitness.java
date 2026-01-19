package com.Day7.fitnesstracker;


import java.util.*;

public class CheckFitness {
	
	public static void main(String []args) {
		List<UserDetails> list = new ArrayList<>();
		  list.add(new UserDetails("Alice",200));
		  list.add(new UserDetails("Bob",250));
		  list.add(new UserDetails("John",300));
		  list.add(new UserDetails("Ruby",350));
		  list.add(new UserDetails("Json",450));
		  
		  FitnessBubbleSort.checkHighestFitness(list);
		  for(int i=0;i<list.size();i++) {
			  System.out.println(list.get(i).getName()+" "+list.get(i).getCounts());
		  }
	}

}
