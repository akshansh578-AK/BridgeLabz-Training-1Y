package com.gla.classesobjects.constructors;

public class LibraryBook {
    private String title;
    private String borrower;
    private boolean borrowed;

    public LibraryBook(String title) {
        this.title = title;
        this.borrower = "";
        this.borrowed = false;
    }

    public void borrowBook(String borrowerName) {
        if (!borrowed) {
            borrowed = true;
            borrower = borrowerName;
        }
    }

    public void displayDetails() {
        System.out.println("LibraryBook: " + title + ", Borrowed: " + borrowed + (borrowed ? ", By: " + borrower : ""));
    }
}
