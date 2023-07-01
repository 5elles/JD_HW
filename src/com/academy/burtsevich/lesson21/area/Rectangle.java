package com.academy.burtsevich.lesson21.area;

public class Rectangle implements Shape {
    private double sideA;
    private double sideB;

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }


    Rectangle(double[] params) {
        this.sideA = params[0];
        this.sideB = params[1];
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
