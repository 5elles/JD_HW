package com.academy.burtsevich.lesson21.area;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                \nВведите номер фигуры, площадь которой вы хотели бы вычислить:\s
                Прямоугольник - 1
                Квадрат - 2
                Круг - 3
                """);
        int usersChoice = scanner.nextInt();

        Shape shape = new ShapeFactory().createShape(usersChoice);
        System.out.println("S = " + shape.getArea());
    }
}
