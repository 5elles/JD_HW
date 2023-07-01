package com.academy.burtsevich.lesson21.area;

public class Circle implements Shape {
    double r;

    Circle(double[] params) {
        this.r = params[0];
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }
}
