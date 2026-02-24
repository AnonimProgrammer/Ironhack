package com.ironhack.day7;

import java.util.List;

public class Author {
    private String name;
    private String lastName;
    private List<Book> publishedBooks;

    public Author(String name, String lastName, List<Book> publishedBooks) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
        if (lastName == null) {
            throw new IllegalArgumentException("Last name cannot be null");
        }
        this.lastName = lastName;
        this.publishedBooks = publishedBooks;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Book> getPublishedBooks() {
        return publishedBooks;
    }
}
