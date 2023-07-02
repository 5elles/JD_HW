package com.academy.burtsevich.lesson21.decorator;

public class MilkAdder extends Kitchen {
    MilkAdder(Drink drink) {
        super(drink);
    }

    @Override
    public void combine() {
        System.out.println("...добавили молоко");
    }
}
