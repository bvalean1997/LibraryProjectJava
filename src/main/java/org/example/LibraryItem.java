package org.example;

import java.util.ArrayList;
import java.util.List;

// Assignment - OOP Principles

abstract class LibraryItem {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public abstract String getDescription();
}

class Book extends LibraryItem {
    private String ISBN;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.setTitle(title);
        this.setAuthor(author);
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String newISBN) {
        ISBN = newISBN;
    }


    @Override
    public String getDescription() {
        return "The book is a my favourite book.";
    }
}

class Magazine extends LibraryItem {
    private int issueNumber;

    public int getIssueNumber() {
        return issueNumber;
    }
    public void setIssueNumber(int newIssueNumber) {
        this.issueNumber = newIssueNumber;
    }

    public Magazine(int issueNumber, String title, String author) {
        this.issueNumber = issueNumber;
        this.setTitle(title);
        this.setAuthor(author);
    }

    @Override
    public String getDescription() {
        return "This is a magazine.";
    }


}
