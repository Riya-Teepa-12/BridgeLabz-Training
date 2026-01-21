package com.Day8.movietime;
 
import java.util.*;
import java.time.LocalTime;
public class MovieTime {
	private static LocalTime td;
	private ShowDetails d;
      public static void main(String []args) { 
    	  Scanner kb =new Scanner(System.in);
    	  ShowDetails sd = new ShowDetails("Ishara",LocalTime.of(13,45,45));
    	  ShowDetails sd1 = new ShowDetails("hara",LocalTime.of(12,45,45));
    	  ShowDetails sd2 = new ShowDetails("Bhoot",LocalTime.of(14,45,45));
    	  ShowDetails sd3 = new ShowDetails("Iyara",LocalTime.of(15,45,45));
    	  ShowDetails sd4 = new ShowDetails("Iara",LocalTime.of(11,11,11));
    	  List<ShowDetails> li = new ArrayList<>();
    	    li.add(sd);
    	    li.add(sd1);
    	    li.add(sd2);
    	    li.add(sd3);
    	    li.add(sd4);
    	  List<ShowDetails> lis = new ArrayList<>();  
    	  lis = InsertionSort.sortAccordingToTiming(li);
    	  for(int i=0;i<lis.size();i++) {
    		  System.out.println(lis.get(i).getName()+" - "+lis.get(i).getTime());
    	  }
      }
}
