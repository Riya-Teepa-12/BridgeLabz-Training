package com.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class BufferedStreams {
    private static final int BUFFER_SIZE = 4096;
	public static void main(String []args) {
		long time1 = System.nanoTime();
		FileInputStream fs = null;
        FileOutputStream out = null;
	try {
           fs = new FileInputStream("C:\\Users\\riya6\\OneDrive\\Desktop\\info.txt");
           out = new FileOutputStream("C:\\Users\\riya6\\OneDrive\\Desktop\\riya_teepa86.java");

           byte[] buffer = new byte[BUFFER_SIZE];
           int bytesRead;

     while((bytesRead=fs.read(buffer))!=-1) {
          out.write(buffer,0,bytesRead);
     }
     System.out.println("DATA COPIED SUCCESSFULLY IN UNBUFFERED!");
	}catch(IOException ex) {
		System.out.println("Source file not found or error occurred!");
	}finally {
        try {
            if (fs != null) fs.close();
            if (out != null) out.close();
        } catch (IOException e) {
            System.out.println("Error while closing the file!");
        }
    }
	
	long time2 = System.nanoTime();
	
	long time3 = System.nanoTime();
	BufferedInputStream bf = null;
     BufferedOutputStream bout = null;
     try {
       bf = new BufferedInputStream(new FileInputStream("C:\\Users\\riya6\\OneDrive\\Desktop\\info.txt"));
       bout = new BufferedOutputStream(new FileOutputStream("C:\\Users\\riya6\\OneDrive\\Desktop\\riya_teepa86.java"));
       byte []buffer = new byte[BUFFER_SIZE];
      
         int data;
        while((data=bf.read(buffer))!=-1) {
      bout.write(buffer,0,data);
       }
      System.out.println("DATA COPIED SUCCESSFULLY IN BUFFERED");
      }catch(IOException ex) {
	System.out.println("Source file not found or error occurred!");
       }finally {
        try {
        if (bf != null) bf.close();
        if (bout != null) bout.close();
       } catch (IOException e) {
        System.out.println("Error while closing the file!");
        }
     }
 	long time4 = System.nanoTime();
 	long time5 = time2-time1;
 	long time6 = time4-time2;
 	 System.out.println("Time taken By unbufferedStream "+time5);
 	 System.out.println("Time taken By bufferedStream "+time6);
	}
}
