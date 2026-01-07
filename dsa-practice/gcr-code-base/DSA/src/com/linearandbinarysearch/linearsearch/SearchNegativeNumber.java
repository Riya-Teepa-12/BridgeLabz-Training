package com.linearandbinarysearch.linearsearch;

import java.util.*;

public class SearchNegativeNumber {
	
	//method to return the negative number
	public static int returnNegativeNumber(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0)
				return i;
		}
		return -1;
	}
	public static void main(String []args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n = kb.nextInt();
		System.out.println("Enter the number :");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= kb.nextInt();
		}
		//calling the method
		int index = returnNegativeNumber(arr);
		
		//display the result
		System.out.println("The index is "+index);
		
	}

}
