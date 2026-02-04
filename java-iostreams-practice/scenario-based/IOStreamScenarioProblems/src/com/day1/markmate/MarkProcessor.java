package com.day1.markmate;

import java.io.*;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MarkProcessor {

    public static List<Student> processCSV(String filePath)
            throws IOException {

        List<Student> students = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        br.readLine();

        while ((line = br.readLine()) != null) {
            try {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];

                int maths = parseMarks(data[2]);
                int science = parseMarks(data[3]);
                int english = parseMarks(data[4]);

                int total = maths + science + english;
                double avg = total / 3.0;
                String grade = calculateGrade(avg);

                students.add(new Student(id, name, total, avg, grade));

            } catch (InvalidMarksException | NumberFormatException e) {
                System.out.println("Skipping invalid entry: " + line);
            }
        }
        br.close();
        return students;
    }

    private static int parseMarks(String value) throws InvalidMarksException {
        try {
            int marks = Integer.parseInt(value);
            if (marks < 0 || marks > 100)
                throw new InvalidMarksException("Marks out of range");
            return marks;
        } catch (NumberFormatException e) {
            throw new InvalidMarksException("Invalid marks");
        }
    }

    private static String calculateGrade(double avg) {
        if (avg >= 90) return "A";
        if (avg >= 75) return "B";
        if (avg >= 60) return "C";
        return "D";
    }

    public static void exportToJSON(List<Student> students, String fileName)
            throws IOException {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter writer = new FileWriter(fileName);
        gson.toJson(students, writer);
        writer.close();
    }
}