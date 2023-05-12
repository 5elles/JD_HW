package com.academy.burtsevich.lesson9;

public class GeometricFigures {

    public void getSideLength() {
        System.out.println("Side a = " + ((Line<?>) this).getSideA().doubleValue());
        if (this instanceof Rectangle<?>) { // "выводит...длину ребра (прямоугольника или параллелепипеда)" -
            // у параллелепипеда несколько ребер, т.к. нет ясности в задании - вывожу все. У прямоугольника две стороны - тоже вывожу обе.
            System.out.println("Side b = " + ((Rectangle<?>) this).getSideB().doubleValue());
        }
        if (this instanceof Parallelepiped<?>) {
            System.out.println("Side c = " + ((Parallelepiped<?>) this).getSideC().doubleValue());
        }
    }

    public void getArea(Parallelepiped parallelepiped) {
        // Площадь основания параллелепипеда для основания в виде прямоуголника
        System.out.println(parallelepiped.getSideA().doubleValue() * parallelepiped.getSideB().doubleValue());
    }

    public void getArea(Rectangle rectangle) {
        System.out.println(rectangle.getSideA().doubleValue() * rectangle.getSideB().doubleValue());
    }

    public void getVolume(Parallelepiped<?> parallelepiped) {
        System.out.println(
                parallelepiped.getSideA().doubleValue() * parallelepiped.getSideB().doubleValue() * parallelepiped.getSideC().doubleValue());
    }
}
