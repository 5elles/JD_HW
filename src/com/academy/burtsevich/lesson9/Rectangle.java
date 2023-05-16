package com.academy.burtsevich.lesson9;

public class Rectangle<T extends Number> extends Line<T>{
    private  T sideB;
    public Rectangle(){}

    public Rectangle(T sideA, T sideB) {
        super(sideA);
        this.sideB = sideB;
    }

    public T getSideB() {
        return sideB;
    }

    public void setSideB(T sideB) {
        this.sideB = sideB;
    }
}
