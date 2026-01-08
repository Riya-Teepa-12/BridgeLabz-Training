package com.algorithmanalysis.file;

public class CompareFile {
	public static void main(String []args) {
		// Path to large file (e.g., 100MB or 500MB)
        String filePath = "largefile.txt";

        // FileReader timing
        long startFR = System.nanoTime();
        FileReaderTest.readFile(filePath);
        long endFR = System.nanoTime();

        // InputStreamReader timing
        long startISR = System.nanoTime();
        InputStreamReaderTest.readFile(filePath);
        long endISR = System.nanoTime();

        double fileReaderTime = (endFR - startFR) / 1_000_000_000.0;
        double inputStreamReaderTime = (endISR - startISR) / 1_000_000_000.0;

        System.out.println("File Size Test");
        System.out.println("FileReader Time: " + fileReaderTime + " seconds");
        System.out.println("InputStreamReader Time: " + inputStreamReaderTime + " seconds");
	}

}
