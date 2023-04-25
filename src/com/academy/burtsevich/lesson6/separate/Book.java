package com.academy.burtsevich.lesson6.separate;

abstract class Book {
    private String genre, title, author;
    private int volumes, numberOfPages;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getVolumes() {
        return volumes;
    }

    public void setVolumes(int volumes) {
        this.volumes = volumes;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Book(String genre, String title, String author, int volumes, int numberOfPages) {
        this.genre = genre;
        this.title = title;
        this.author = author;
        this.volumes = volumes;
        this.numberOfPages = numberOfPages;
    }
}
