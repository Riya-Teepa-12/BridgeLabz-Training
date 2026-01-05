package com.hashmapandfunction;

import java.util.HashMap;
import java.util.Map;


public class SumInArray {
	
	public static boolean hasPairWithSum(int[] arr, int target) {
        Map<Integer, Boolean> map = new HashMap<>();

        for (int num : arr) {
            int required = target - num;

            if (map.containsKey(required)) {
                return true;
            }

            map.put(num, true);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        System.out.println(hasPairWithSum(arr, target));

  }
}
