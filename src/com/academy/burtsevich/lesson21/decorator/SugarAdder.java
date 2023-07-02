package com.academy.burtsevich.lesson21.decorator;

public class SugarAdder extends Kitchen{

    SugarAdder(Drink drink) {
        super(drink);
    }

    @Override
    public void combine() {
        System.out.println("...добавили сахар");
    }
}
