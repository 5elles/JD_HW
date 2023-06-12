package com.academy.burtsevich.lesson16.port;

public class Port {
    public static final int SHIPS_TO_SERVE = 1000;


    public static void main(String[] args) {

        System.out.println("Порт готов к приему кораблей");

        new Thread(new Service()).start();


    }
}
