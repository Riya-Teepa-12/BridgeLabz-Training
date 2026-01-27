package com.csv.jsoncsvconverter;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.*;

class Student {
    public int id;
    public String name;
    public int age;
    public int marks;
}
public class JSONCSVConvertor {
	// JSON → CSV
    public static void jsonToCsv(String jsonFile, String csvFile) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        List<Student> students =
                mapper.readValue(new File(jsonFile),
                        new TypeReference<List<Student>>() {});

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            bw.write("id,name,age,marks");
            bw.newLine();

            for (Student s : students) {
                bw.write(s.id + "," + s.name + "," + s.age + "," + s.marks);
                bw.newLine();
            }
        }
    }

    // CSV → JSON
    public static void csvToJson(String csvFile, String jsonFile) throws IOException {
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line = br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                Student s = new Student();
                s.id = Integer.parseInt(data[0]);
                s.name = data[1];
                s.age = Integer.parseInt(data[2]);
                s.marks = Integer.parseInt(data[3]);

                students.add(s);
            }
        }
       
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File(jsonFile), students);
    }

    public static void main(String[] args) throws Exception {

        jsonToCsv("students.json", "students_from_json.csv");
        csvToJson("students_from_json.csv", "students_from_csv.json");

        System.out.println("JSON ↔ CSV conversion completed successfully!");
    }
}

