package com.academy.burtsevich.lesson21.area;

import java.util.Scanner;

public class Rectangle implements Shape {
    private double sideA;
    private double sideB;

    Scanner scanner = new Scanner(System.in);

    public void setSideA(double sideA) {
        if (sideA <= 0) {
            throw new ArithmeticException("Ошибка в размерах фигуры!!!");
        }
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        if (sideB <= 0) {
            throw new ArithmeticException("Ошибка в размерах фигуры!!!");
        }
        this.sideB = sideB;
    }

    Rectangle() {
        System.out.print("Сторона A = ");
        setSideA(scanner.nextDouble());
        System.out.print("Сторона B = ");
        setSideB(scanner.nextDouble());
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
