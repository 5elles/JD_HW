package com.academy.burtsevich.lesson9;

public class Task4 {
    public static void main(String[] args) {
        Line<?> line1 = new Line<>(10);
        Rectangle<?> rectangle1 = new Rectangle<>(4, 2);
        Parallelepiped<?> parallelepiped1 = new Parallelepiped<>(5, 6, 3);
        Cube cube = new Cube(1, 2, 3); // выводится предупреждение
        Cube cube1 = new Cube(3, 3, 3);

        line1.getSideLength();
        System.out.println("#####");
        rectangle1.getSideLength();
        System.out.println("#####");
        parallelepiped1.getSideLength();
        System.out.println("#####");
        line1.getArea();
        System.out.print("Площадь прямоугольника: ");
        rectangle1.getArea();
        System.out.print("Площадь основания прямоугольного паралеллепипеда: ");
        parallelepiped1.getArea();
        System.out.print("Объем паралеллепипеда: ");
        parallelepiped1.getVolume();
        System.out.println("#####");
        System.out.print("V куба: ");
        cube1.getVolume();
        System.out.print("S основания куба: ");
        cube1.getArea();
        System.out.println("#####");
        System.out.println("Куб до изменения одной из сторон");
        System.out.println(cube1);
        cube1.setSideA(5);
        System.out.println("Куб после");
        System.out.println(cube1);
    }
}
