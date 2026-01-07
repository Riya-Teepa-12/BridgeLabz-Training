package com.linearandbinarysearch.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordOccurence {

    public static void main(String[] args) {

        String fileName = "input.txt";
        String targetWord = "java";
        int count = 0;

        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {

                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            br.close();
            fr.close();

            System.out.println("Word \"" + targetWord + "\" appears " + count + " times.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
