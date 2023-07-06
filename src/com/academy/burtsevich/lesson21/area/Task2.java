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

        //нужно делегировать запрос параметров самой фигуре. т.е. по первому запросу создается фигура и она сама своими методами спрашивает и считает все что нужно
        //т.о. полученное вначале число отдается фабрике, фабрика возвращает фигуру и дальше выполняются действия, одинаковые для всех объектов
        switch (usersChoice) {
            case 1 -> {
                double a, b;
                System.out.print("Сторона A = ");
                a = scanner.nextDouble();
                System.out.print("Сторона B = ");
                b = scanner.nextDouble();
                if (a <= 0 || b <= 0) {
                    throw new RuntimeException("Ошибка в размерах фигуры!!!");
                }
                Shape shape = new ShapeFactory().createShape(usersChoice, a, b);
                System.out.println("S = " + shape.getArea());
            }
            case 2 -> {
                double a;
                System.out.print("Сторона квадрата = ");
                a = scanner.nextDouble();
                if (a <= 0) {
                    throw new RuntimeException("Ошибка в размерах фигуры!!!");
                }
                Shape shape = new ShapeFactory().createShape(usersChoice, a);
                System.out.println("S = " + shape.getArea());
            }
            case 3 -> {
                double r;
                System.out.print("Радиус круга = ");
                r = scanner.nextDouble();
                if (r <= 0) {
                    throw new RuntimeException("Ошибка в размерах фигуры!!!");
                }
                Shape shape = new ShapeFactory().createShape(usersChoice, r);
                System.out.println("S = " + shape.getArea());
            }
            default -> throw new RuntimeException("\"Ошибка в выборе фигуры!!!\"");
        }


    }
}
