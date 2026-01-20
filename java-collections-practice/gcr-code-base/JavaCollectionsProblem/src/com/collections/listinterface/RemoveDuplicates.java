package com.collections.listinterface;

import java.util.*;

public class RemoveDuplicates {
         
	public static void main(String []args) {
		Scanner kb = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter 6  numbers");
		int arr[] = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = kb.nextInt();
			list.add(arr[i]);
		}
		
	
		List<Integer> list1 = new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			if(!list1.contains(list.get(i))) {
				list1.add(list.get(i));
			}
		}
		
		System.out.println(list1);
		
	}
}
