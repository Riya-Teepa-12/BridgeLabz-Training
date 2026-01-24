package com.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LargeFile {
	 public static void main(String[] args) {

	        try {
	            FileReader fr = new FileReader("C:\\Users\\riya6\\OneDrive\\Desktop\\largeFile.txt");
	            BufferedReader br = new BufferedReader(fr);

	            String line;

	            while ((line = br.readLine()) != null) {
	                if (line.toLowerCase().contains("error")) {
	                    System.out.println(line);
	                }
	            }

	            br.close();
	            fr.close();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

