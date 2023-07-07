package com.academy.burtsevich.lesson21.area;

import java.util.Scanner;

public class Square implements Shape {
    Scanner scanner = new Scanner(System.in);
    private double sideA;

    public void setSideA(double sideA) {
        if (sideA <= 0) {
            throw new ArithmeticException("Ошибка в размерах фигуры!!!");
        }
        this.sideA = sideA;
    }

    Square() {
        System.out.print("Сторона квадрата = ");
        setSideA(scanner.nextDouble());
    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }
}
