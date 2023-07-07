package com.academy.burtsevich.lesson21.decorator;

public class SugarAdder implements Drink {
    private final Drink drink;

    SugarAdder(Drink drink) {
        this.drink = drink;
    }

    @Override
    public void makeDrink() {
        System.out.println("...добавили сахар");
        drink.makeDrink();
    }

}
