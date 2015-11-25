package ua.com.webcamp.JavaAdv.Lesson06.Ex_04Optional;

import java.io.Serializable;

/**
 * Created by Artem Vereschaka on 8/19/15.
 * artem.andzen@gmail.com
 */

/**
 * Represents a book
 */
public class Book implements Serializable{
    /**
     * Name of book
     */
    private String name;
    /**
     * Name of author of this book
     */
    private String author;
    /**
     * Number of pages in book
     */
    private int pages;
    /**
     * When the book is written
     */
    private transient int year; // transient - not serializable field


    public Book(String name, String author, int pages, int year) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
