package com.academy.burtsevich.lesson6;

public class ShapeParameterPrinter {
    public void getArea(Shape shape){
        System.out.println("S = " + shape.area());
    }

    public void getPerimeter(Shape shape){
        System.out.println("P = " + shape.perimeter());
    }

    public void getAreaAndPerimeter(Shape shape){
        System.out.println("S = " + shape.area() + " | P = " + shape.perimeter());
    }
}
