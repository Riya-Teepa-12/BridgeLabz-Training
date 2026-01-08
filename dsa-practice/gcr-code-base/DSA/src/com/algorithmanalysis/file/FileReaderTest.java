package com.algorithmanalysis.file;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
  
	public static void readFile(String filePath) {
        try (
        	FileReader fr = new FileReader(filePath)) {
            while (fr.read() != -1) {
                // reading character by character
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}
