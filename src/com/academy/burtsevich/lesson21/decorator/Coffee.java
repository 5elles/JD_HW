package com.academy.burtsevich.lesson21.decorator;

public class Coffee implements Drink {

    Coffee() {
    }

    @Override
    public void makeDrink() {
        System.out.println("готовится кофе...");
    }
}
