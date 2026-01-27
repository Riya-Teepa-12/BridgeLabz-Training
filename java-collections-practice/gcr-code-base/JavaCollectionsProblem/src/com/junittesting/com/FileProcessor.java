package com.junittesting.com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcessor {
	// Write content to a file
    public static void writeToFile(String filename, String content) throws IOException {
        Path path = Paths.get(filename);
        Files.write(path, content.getBytes());
    }

    // Read content from a file
    public static String readFromFile(String filename) throws IOException {
        Path path = Paths.get(filename);
        return new String(Files.readAllBytes(path));
    }
}
