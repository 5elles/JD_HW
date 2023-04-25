package com.academy.burtsevich.lesson6.separate;

public class MainBook {
    public static void main(String[] args) {
        Directory directory1 = new Directory("Phone book", "Phone book of the World", "Telecom", 1, 350);
        Encyclopedia encyclopedia1 = new Encyclopedia("Children's encyclopedia", "Все обо всем", "Росмэн",5, 250);
        Textbook textbook = new Textbook("History", "Ancient world history", "Ministry of Education", 2, 124);

        directory1.openTheBook();
        directory1.readTheBook();
        encyclopedia1.openTheBook();
        encyclopedia1.readTheBook();
        textbook.openTheBook();
        textbook.readTheBook();
    }
}
