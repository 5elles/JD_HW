package com.academy.burtsevich.lesson21.decorator;

public class SyrupAdder extends Kitchen{
    SyrupAdder(Drink drink) {
        super(drink);
    }

    @Override
    public void combine() {
        System.out.println("...добавили сироп");
    }
}
