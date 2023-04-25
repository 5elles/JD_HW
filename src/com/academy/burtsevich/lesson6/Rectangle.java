package com.academy.burtsevich.lesson6;

public class Rectangle implements Shape {
    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double area() {
        return  a * b;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }
}
