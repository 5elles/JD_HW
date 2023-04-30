package com.academy.burtsevich.lesson7;

public class Letter extends Document{
    public Letter() {
    }

    public Letter(String docsName, int numberOfPages) {
        super(docsName, numberOfPages);
    }

    public Letter(String docsName, int numberOfPages, boolean relevance) {
        super(docsName, numberOfPages, relevance);
    }


}
