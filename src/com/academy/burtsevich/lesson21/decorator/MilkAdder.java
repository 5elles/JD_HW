package com.academy.burtsevich.lesson21.decorator;

public class MilkAdder implements Drink {
    private final Drink drink;

    MilkAdder(Drink drink) {
        this.drink = drink;
    }

    @Override
    public void makeDrink() {
        System.out.println("...добавили молоко");
        drink.makeDrink();
    }
}
