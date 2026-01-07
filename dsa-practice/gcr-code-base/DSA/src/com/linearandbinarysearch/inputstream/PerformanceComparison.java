package com.linearandbinarysearch.inputstream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PerformanceComparison {

    private static final int ITERATIONS = 1_000_000;
    private static final String TEXT = "hello";

    // StringBuilder test
    public static void testStringBuilder() {
        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) {
            sb.append(TEXT);
        }

        long end = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end - start) + " ms");
    }

    // StringBuffer test
    public static void testStringBuffer() {
        long start = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) {
            sb.append(TEXT);
        }

        long end = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (end - start) + " ms");
    }

    // FileReader word count
    public static void testFileReader(String filePath) throws IOException {
        long start = System.currentTimeMillis();
        long wordCount = 0;

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+");
            wordCount += words.length;
        }

        br.close();
        long end = System.currentTimeMillis();

        System.out.println("FileReader Word Count: " + wordCount);
        System.out.println("FileReader Time: " + (end - start) + " ms");
    }

    // InputStreamReader word count
    public static void testInputStreamReader(String filePath) throws IOException {
        long start = System.currentTimeMillis();
        long wordCount = 0;

        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(filePath),
                        StandardCharsets.UTF_8
                )
        );

        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+");
            wordCount += words.length;
        }

        br.close();
        long end = System.currentTimeMillis();

        System.out.println("InputStreamReader Word Count: " + wordCount);
        System.out.println("InputStreamReader Time: " + (end - start) + " ms");
    }

    public static void main(String[] args) {

        try {
            System.out.println("---- StringBuilder vs StringBuffer ----");
            testStringBuilder();
            testStringBuffer();

            System.out.println("\n---- FileReader vs InputStreamReader ----");
            String filePath = "largefile.txt"; // ~100MB file
            testFileReader(filePath);
            testInputStreamReader(filePath);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
