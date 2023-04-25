package com.academy.burtsevich.lesson6;

public class Task2 {
    public static void main(String[] args) {
        Circle circle = new Circle(12.0);
        Rectangle rectangle = new Rectangle(2.0, 3.0);
        Triangle triangle = new Triangle(2, 3, 4);
        ShapeParameterPrinter parameterPrinter = new ShapeParameterPrinter();

        System.out.println("Круг:");
        parameterPrinter.getArea(circle);
        parameterPrinter.getPerimeter(circle);
        parameterPrinter.getAreaAndPerimeter(circle);
        System.out.println("****************************");
        System.out.println("Прямоугольник:");
        parameterPrinter.getArea(rectangle);
        parameterPrinter.getPerimeter(rectangle);
        parameterPrinter.getAreaAndPerimeter(rectangle);
        System.out.println("****************************");
        System.out.println("Треугольник:");
        parameterPrinter.getArea(triangle);
        parameterPrinter.getPerimeter(triangle);
        parameterPrinter.getAreaAndPerimeter(triangle);



    }
}
