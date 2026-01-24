package com.streams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class ConvertImageToByteArray {
    
	public static void main(String []args) {
		 String sourceImage = "C:\\Users\\riya6\\Downloads\\Riya Teepa Photo.png";
	        String destinationImage = "C:\\Users\\riya6\\OneDrive\\Desktop\\pRiya.jpg";

	        FileInputStream fis = null;
	        FileOutputStream fos = null;
	        ByteArrayOutputStream baos = null;
	        ByteArrayInputStream bais = null;

	        try {
	            // Step 1: Read image into ByteArrayOutputStream
	            fis = new FileInputStream(sourceImage);
	            baos = new ByteArrayOutputStream();

	            byte[] buffer = new byte[1024];
	            int bytesRead;

	            while ((bytesRead = fis.read(buffer)) != -1) {
	                baos.write(buffer, 0, bytesRead);
	            }

	            // Convert to byte array
	            byte[] imageBytes = baos.toByteArray();

	            // Step 2: Write byte array back to new image file
	            bais = new ByteArrayInputStream(imageBytes);
	            fos = new FileOutputStream(destinationImage);

	            while ((bytesRead = bais.read(buffer)) != -1) {
	                fos.write(buffer, 0, bytesRead);
	            }

	            System.out.println("Image copied successfully!");
	            System.out.println("Original image bytes : " + imageBytes.length);
	            System.out.println("New image created at: " + destinationImage);

	        } catch (IOException e) {
	            System.out.println("Error while processing image file.");
	            e.printStackTrace();
	        } finally {
	            try {
	                if (fis != null) fis.close();
	                if (fos != null) fos.close();
	                if (baos != null) baos.close();
	                if (bais != null) bais.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	
	}

