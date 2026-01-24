package com.exceptionalhandling;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoClosingResources {
  public static void main(String []args) {
	  try( BufferedReader rd = new BufferedReader(new FileReader("C:\\Users\\riya6\\OneDrive\\Desktop\\info.txt"))) {
	 
	  String line;
	  while ((line = rd.readLine()) != null) {
          System.out.println(line);
      }


      }catch(IOException e) {
          System.out.println("Error Reading File");
      
  }
  
   }
}
