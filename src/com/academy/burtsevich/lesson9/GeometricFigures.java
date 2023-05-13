package com.academy.burtsevich.lesson9;

public class GeometricFigures {

    public void getSideLength() {
        System.out.println("Side a = " + ((Line<?>) this).getSideA().doubleValue());
        if (this instanceof Rectangle<?>) { // "выводит...длину ребра (прямоугольника или параллелепипеда)" -
            // у параллелепипеда несколько ребер, т.к. нет ясности в задании - вывожу все. У прямоугольника две стороны - тоже вывожу обе.
            //смысл в том. что sideA есть и у линии и у прямоугольника и у параллелепипеда. вот ее и нужно вывести.
            //тогда и instaceof не нужны.
            System.out.println("Side b = " + ((Rectangle<?>) this).getSideB().doubleValue());
        }
        if (this instanceof Parallelepiped<?>) {
            System.out.println("Side c = " + ((Parallelepiped<?>) this).getSideC().doubleValue());
        }
    }

    public void getArea(Rectangle<?> figure) {
        System.out.println(figure.getSideA().doubleValue() * figure.getSideB().doubleValue());
    }

    public void getVolume(Parallelepiped<?> parallelepiped) {
        System.out.println(
                parallelepiped.getSideA().doubleValue() * parallelepiped.getSideB().doubleValue() * parallelepiped.getSideC().doubleValue());
    }
}
