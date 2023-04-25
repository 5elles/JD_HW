package com.academy.burtsevich.lesson6.separate;

public class Encyclopedia extends Book implements Publisher {
    public Encyclopedia(String genre, String title, String author, int volumes, int numberOfPages) {
        super(genre, title, author, volumes, numberOfPages);
    }

    @Override
    public void openTheBook() {
        System.out.println("Открой \"" + this.getTitle() + "\"");
    }

    @Override
    public void readTheBook() {
        System.out.println("Читаем \"" + this.getTitle() + "\"");
    }
}
