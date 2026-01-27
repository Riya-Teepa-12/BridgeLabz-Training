package com.junittesting.test;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.junittesting.com.FileProcessor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileProcessorTest {
	private final String testFile = "testFile.txt";

    // Test writing and reading file
    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello JUnit 5 File Test!";
        FileProcessor.writeToFile(testFile, content);
        assertTrue(Files.exists(Paths.get(testFile)));
        String readContent = FileProcessor.readFromFile(testFile);
        assertEquals(content, readContent);
        Files.deleteIfExists(Paths.get(testFile));
    }

    // Test reading a non-existent file (should throw IOException)
    @Test
    void testReadNonExistentFile() {
        String nonExistentFile = "noFile.txt";
        assertThrows(IOException.class, () -> {
            FileProcessor.readFromFile(nonExistentFile);
        });
    }
}
