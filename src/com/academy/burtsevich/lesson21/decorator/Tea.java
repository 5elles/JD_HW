package com.academy.burtsevich.lesson21.decorator;

public class Tea implements Drink{
    @Override
    public void makeDrink() {
        System.out.println("Готовится чай...");
    }
}
