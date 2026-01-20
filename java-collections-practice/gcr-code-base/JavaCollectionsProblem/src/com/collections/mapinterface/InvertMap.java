package com.collections.mapinterface;

import java.util.*;

public class InvertMap {

	public static Map<Integer,char[]> invertMap(Map<Character,Integer> map){
		 // Temporary map to collect characters
        Map<Integer, List<Character>> tempMap = new HashMap<>();

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            tempMap
                .computeIfAbsent(e.getValue(), k -> new ArrayList<>())
                .add(e.getKey());
        }

        // Convert List<Character> to char[]
        Map<Integer, char[]> result = new HashMap<>();

        for (Map.Entry<Integer, List<Character>> e : tempMap.entrySet()) {
            List<Character> list = e.getValue();
            char[] arr = new char[list.size()];
            for (int i = 0; i < list.size(); i++) {
                arr[i] = list.get(i);
            }
            result.put(e.getKey(), arr);
        }

        return result;
    }

    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 1);
        map.put('d', 2);
        map.put('e', 3);

        Map<Integer, char[]> inverted = invertMap(map);

        for (Map.Entry<Integer, char[]> e : inverted.entrySet()) {
            System.out.print(e.getKey() + " -> ");
            System.out.println(Arrays.toString(e.getValue()));
        }
    }
}
