package com.academy.burtsevich.lesson6.separate;

public class Directory extends Book implements Publisher {
    public Directory(String genre, String title, String author, int volumes, int numberOfPages) {
        super(genre, title, author, volumes, numberOfPages);
    }



    @Override
    public void openTheBook() {
        System.out.println("Ты открыл книгу " + "\"" + this.getTitle() + "\"");
    }

    @Override
    public void readTheBook() {
        System.out.println("Тебе нужно прочитать " + this.getNumberOfPages()+ " страниц");
    }
}
