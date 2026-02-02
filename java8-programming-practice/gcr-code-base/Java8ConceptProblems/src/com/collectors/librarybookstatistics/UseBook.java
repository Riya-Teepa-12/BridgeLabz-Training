package com.collectors.librarybookstatistics;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.*;

public class UseBook {
    
	public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Java Basics", "Programming", 450),
                new Book("Spring Boot", "Programming", 550),
                new Book("Harry Potter", "Fantasy", 400),
                new Book("Lord of the Rings", "Fantasy", 720),
                new Book("Atomic Habits", "Self-Help", 320)
        );

        Map<String, IntSummaryStatistics> bookStatsByGenre = books.stream().collect(Collectors.groupingBy(Book::getGenre, Collectors.summarizingInt(Book::getPages)));

        bookStatsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("Total Pages: " + stats.getSum());
            System.out.println("Average Pages: " + stats.getAverage());
            System.out.println("Max Pages: " + stats.getMax());
            System.out.println();
        });
    }
}
