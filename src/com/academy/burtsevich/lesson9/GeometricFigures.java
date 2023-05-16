package com.academy.burtsevich.lesson9;

public class GeometricFigures {

    public void getSideLength(Line<?> line) {
        System.out.println("Side a = " + line.getSideA());
    }

    public void getArea(Rectangle<?> figure) {
        System.out.println(figure.getSideA().doubleValue() * figure.getSideB().doubleValue());
    }

    public void getVolume(Parallelepiped<?> parallelepiped) {
        System.out.println(
                parallelepiped.getSideA().doubleValue() * parallelepiped.getSideB().doubleValue() * parallelepiped.getSideC().doubleValue());
    }
}
