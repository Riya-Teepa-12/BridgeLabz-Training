package com.algorithmanalysis.file;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;


public class InputStreamReaderTest {
	  public static void readFile(String filePath) {
	        try (InputStreamReader isr =
	                     new InputStreamReader(new FileInputStream(filePath))) {

	            while (isr.read() != -1) {
	                // reading byte stream converted to characters
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
