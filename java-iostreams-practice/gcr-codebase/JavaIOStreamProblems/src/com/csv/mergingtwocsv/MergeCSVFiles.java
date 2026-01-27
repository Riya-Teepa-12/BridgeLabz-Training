package com.csv.mergingtwocsv;

import java.io.*;
import java.util.*;

public class MergeCSVFiles {
	public static void main(String[] args) throws IOException {

        String file1 = "src/com/csv/mergingtwocsv/students1.csv";
        String file2 = "src/com/csv/mergingtwocsv/students2.csv";
        String output = "src/com/csv/mergingtwocsv/merged_students.csv";

  
        Map<String, String[]> studentInfo = new HashMap<>();

        // Read first CSV
        try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
            String line = br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                studentInfo.put(data[0], new String[]{data[1], data[2]});
            }
        }

        // Write merged CSV
        try (BufferedReader br = new BufferedReader(new FileReader(file2));
             BufferedWriter bw = new BufferedWriter(new FileWriter(output))) {

            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            String line = br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];

                if (studentInfo.containsKey(id)) {
                    String[] info = studentInfo.get(id);
                    bw.write(id + "," + info[0] + "," + info[1] + "," + data[1] + "," + data[2]);
                    bw.newLine();
                }
            }
        }

        System.out.println("CSV files merged successfully!");
    }
}
