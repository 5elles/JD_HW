package com.academy.burtsevich.lesson15;

public class Task1 {
    public static void main(String[] args) {
        new Thread(new Printer("Текст 1")).start();
        new Thread(new Printer("Текст 2")).start();
        new Thread(new Printer("Текст 3")).start();

    }
}
