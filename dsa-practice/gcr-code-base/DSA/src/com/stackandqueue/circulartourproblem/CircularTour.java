package com.stackandqueue.circulartourproblem;

import java.util.*;

public class CircularTour {
	  public static int findStartingPoint(int[] petrol, int[] distance) {
	        int n = petrol.length;
	        Queue<Integer> queue = new LinkedList<>();
	        int surplus = 0;
	        int start = 0;

	        for (int i = 0; i < n; i++) {
	            queue.offer(i);
	            surplus += petrol[i] - distance[i];

	            // If surplus goes negative, remove from front
	            while (surplus < 0 && !queue.isEmpty()) {
	                int removed = queue.poll();
	                surplus -= petrol[removed] - distance[removed];
	                start = removed + 1;
	           }
	        }

	        return queue.size() == n ? start : -1;
	  }

}
