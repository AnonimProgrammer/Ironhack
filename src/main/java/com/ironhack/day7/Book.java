package com.ironhack.day7;

public class Book {
    private String title;
    private int pages;

    public Book(String title, int pages) {
        if (title == null) {
            throw new IllegalArgumentException("Title cannot be null");
        }
        this.title = title;
        if (pages < 1) {
            throw new IllegalArgumentException("Pages cannot be less than 1");
        }
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }
}
