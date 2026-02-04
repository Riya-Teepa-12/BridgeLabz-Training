package com.day1.markmate;

import java.util.List;

public class MarkMateRunner {

    public static void main(String[] args) {

        try {
            List<Student> students =
                    MarkProcessor.processCSV("src/com/day1/markmate/marks.csv");

            MarkProcessor.exportToJSON(students, "reportCard.json");

            System.out.println("JSON Report Card Generated Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}