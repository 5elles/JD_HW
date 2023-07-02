package com.academy.burtsevich.lesson21.decorator;

abstract public class Kitchen implements Drink{
    private final Drink drink;

    Kitchen(Drink drink){
        this.drink = drink;
        makeDrink();
    }

    public abstract void combine();

    @Override
    public void makeDrink() {
        drink.makeDrink();
        combine();
    }
}
