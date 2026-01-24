package com.streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConvertUppercaseToLowercase {

    public static void main(String[] args) {

        String sourceFile = "C:\\Users\\riya6\\OneDrive\\Desktop\\input.txt";
        String destFile = "C:\\Users\\riya6\\OneDrive\\Desktop\\output.txt";

        try (
            BufferedReader br = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(destFile))
        ) {

            int ch;
            while ((ch = br.read()) != -1) {
                bw.write(Character.toLowerCase((char) ch));
            }

            System.out.println("File converted successfully!");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
