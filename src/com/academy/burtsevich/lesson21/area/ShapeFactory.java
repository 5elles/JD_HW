package com.academy.burtsevich.lesson21.area;

public class ShapeFactory {

    public Shape createShape(int usersChoice) {

        Shape shape = null;
        switch (usersChoice) {
            case 1 -> shape = new Rectangle();
            case 2 -> shape = new Square();
            case 3 -> shape = new Circle();
            default -> throw new RuntimeException("Ошибка в выборе фигуры!!!");
        }
        return shape;
    }
}
