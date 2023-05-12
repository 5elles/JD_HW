package com.academy.burtsevich.lesson9;

public class Task4 {
    public static void main(String[] args) {
        Line<?> line1 = new Line<>(10);
        Rectangle<?> rectangle1 = new Rectangle<>(4, 2);
        Parallelepiped<?> parallelepiped1 = new Parallelepiped<>(5, 6, 3);
        Cube cube = new Cube(1, 2, 3); // выводится предупреждение
        Cube cube1 = new Cube(3, 3, 3);
        GeometricFigures geometricFigures = new GeometricFigures();

        line1.getSideLength();
        System.out.println("#####");
        rectangle1.getSideLength();
        System.out.println("#####");
        parallelepiped1.getSideLength();
        System.out.println("#####");
        System.out.print("Площадь прямоугольника: ");
        geometricFigures.getArea(rectangle1);
        System.out.print("Площадь основания прямоугольного параллелепипеда: ");
        geometricFigures.getArea(parallelepiped1);
        System.out.print("Объем параллелепипеда: ");
        geometricFigures.getVolume(parallelepiped1);
        System.out.println("#####");
        System.out.print("V куба: ");
        geometricFigures.getVolume(cube1);
        System.out.print("S основания куба: ");
        geometricFigures.getArea(cube1);
        System.out.println("#####");
        System.out.println("Куб до изменения одной из сторон");
        System.out.println(cube1);
        cube1.setSideA(5);
        System.out.println("Куб после");
        System.out.println(cube1);
    }
}
