package com.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteFile {
       
	public static void main(String []args) {
		    FileInputStream fs = null;
	        FileOutputStream out = null;
		try {
	           fs = new FileInputStream("C:\\Users\\riya6\\OneDrive\\Desktop\\info.txt");
	           out = new FileOutputStream("C:\\Users\\riya6\\OneDrive\\Desktop\\riya_teepa86.java");
	     int data;
	     while((data=fs.read())!=-1) {
	          out.write(data);
	     }
	     System.out.println("DATA COPIED SUCCESSFULLY!");
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
		
	}
}
