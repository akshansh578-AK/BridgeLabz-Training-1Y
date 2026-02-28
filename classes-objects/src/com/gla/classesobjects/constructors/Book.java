package com.gla.classesobjects.constructors;

public class Book {
    private String title;
    private String author;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Book: " + title + " by " + author);
    }
}
