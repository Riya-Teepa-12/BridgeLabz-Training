package com.Day7.fitnesstracker;

import java.util.*;

public class FitnessBubbleSort {
       private UserDetails us;
	   public static List<UserDetails> checkHighestFitness(List<UserDetails> user){
		      
		   for(int i=0;i<user.size()-1;i++) {
			   for(int j=0;j<user.size()-1-i;j++) {
			           UserDetails s = user.get(j);
			            UserDetails  t = user.get(j+1);
			          if(user.get(j).getCounts()<user.get(j+1).getCounts()) {
			        	  user.set(j+1,s);
			        	  user.set(j,t);
			          }
			   }
		   }
		   return user;
	   }
}
