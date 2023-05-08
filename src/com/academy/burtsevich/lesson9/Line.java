package com.academy.burtsevich.lesson9;

public class Line<T extends Number> extends GeometricFigures{

    private T sideA;

    public Line(){}

    public Line(T sideA) {
        this.sideA = sideA;
    }

    public T getSideA() {
        return sideA;
    }

    public void setSideA(T sideA) {
        this.sideA = sideA;
    }
}
