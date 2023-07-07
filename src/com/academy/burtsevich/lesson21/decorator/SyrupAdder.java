package com.academy.burtsevich.lesson21.decorator;

public class SyrupAdder implements Drink {
    private final Drink drink;

    SyrupAdder(Drink drink) {
        this.drink = drink;
    }

    @Override
    public void makeDrink() {
        System.out.println("...добавили сироп");
        drink.makeDrink();
    }

}
