package com.academy.burtsevich.lesson21.decorator;

public class Coffee implements Drink{
    @Override
    public void makeDrink() {
        System.out.println("Готовится кофе...");
    }
}
