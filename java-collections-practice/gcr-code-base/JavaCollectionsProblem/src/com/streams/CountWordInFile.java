package com.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CountWordInFile {
	public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        try {
            FileReader fr = new FileReader("C:\\Users\\riya6\\OneDrive\\Desktop\\info.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");

                for (String word : words) {
                    if (map.containsKey(word)) {
                        map.put(word, map.get(word) + 1);
                    } else {
                        map.put(word, 1);
                    }
                }
            }

            br.close();
            fr.close();

            List<Map.Entry<String, Integer>> list =
                    new ArrayList<>(map.entrySet());

            Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

            System.out.println("Top 5 most frequent words:");
            for (int i = 0; i < 5 && i < list.size(); i++) {
                System.out.println(list.get(i).getKey() + " : " + list.get(i).getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 
