package com.linkedlist.circularlinkedlist.roundrobinalgorithm;

import java.util.*;

public class UseRoundRobin {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Time Quantum: ");
	        int tq = sc.nextInt();
	        RoundRobinScheduler scheduler = new RoundRobinScheduler(tq);

	        System.out.print("Enter number of processes: ");
	        int n = sc.nextInt();

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter Process ID: ");
	            int pid = sc.nextInt();
	            System.out.print("Enter Burst Time: ");
	            int bt = sc.nextInt();
	            System.out.print("Enter Priority: ");
	            int priority = sc.nextInt();

	            scheduler.addProcess(pid, bt, priority);
	        }

	        scheduler.execute();
	        sc.close();
	    }

}
