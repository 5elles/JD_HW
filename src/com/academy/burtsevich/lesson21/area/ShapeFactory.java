package com.academy.burtsevich.lesson21.area;

public class ShapeFactory {

    public Shape createShape(int usersChoice, double... ints) {
        Shape shape = null;
        switch (usersChoice) {
            case 1 -> shape = new Rectangle(ints);
            case 2 -> shape = new Square(ints);
            case 3 -> shape = new Circle(ints);
        }
        return shape;
    }
}
