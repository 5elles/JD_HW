package com.academy.burtsevich.lesson21.area;

import java.util.Scanner;

public class Circle implements Shape {
    private double radius;
    Scanner scanner = new Scanner(System.in);

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new ArithmeticException("Ошибка в размерах фигуры!!!");
        }
        this.radius = radius;
    }

    Circle() {
        System.out.print("Радиус круга = ");
        setRadius(scanner.nextDouble());
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
