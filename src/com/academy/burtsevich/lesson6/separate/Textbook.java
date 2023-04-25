package com.academy.burtsevich.lesson6.separate;

public class Textbook extends Book implements Publisher {
    public Textbook(String genre, String title, String author, int volumes, int numberOfPages) {
        super(genre, title, author, volumes, numberOfPages);
    }

    @Override
    public void openTheBook() {
        System.out.println("Открыта книга \"" + this.getTitle() + "\"");
    }

    @Override
    public void readTheBook() {
        System.out.println("Почитай книгу \"" + this.getTitle() + "\"");
    }
}
