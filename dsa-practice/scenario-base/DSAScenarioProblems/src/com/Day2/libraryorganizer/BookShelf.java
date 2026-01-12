package com.Day2.libraryorganizer;

import java.util.*;

public class BookShelf {


    private HashMap<String, LinkedList<Book>> library = new HashMap<>();

    // to avoid duplicate books
    private HashSet<String> bookSet = new HashSet<>();

    // Add book
    public void addBook(String genre, String title, String author) {

        String uniqueKey = genre + title + author;

        if (bookSet.contains(uniqueKey)) {
            System.out.println("Book already exists!");
            return;
        }

        library.putIfAbsent(genre, new LinkedList<>());
        library.get(genre).add(new Book(title, author));

        bookSet.add(uniqueKey);
        System.out.println("Book added successfully");
    }

    // Borrow book (remove)
    public void borrowBook(String genre, String title) {

        if (!library.containsKey(genre)) {
            System.out.println("Genre not found");
            return;
        }

        LinkedList<Book> books = library.get(genre);
        Iterator<Book> it = books.iterator();

        while (it.hasNext()) {
            Book b = it.next();
            if (b.title.equalsIgnoreCase(title)) {
                it.remove();
                bookSet.remove(genre + b.title + b.author);
                System.out.println("Book borrowed: " + b);
                return;
            }
        }

        System.out.println("Book not available");
    }

    // Display library
    public void displayLibrary() {
        for (String genre : library.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book b : library.get(genre)) {
                System.out.println("  " + b);
            }
        }
    }
}
