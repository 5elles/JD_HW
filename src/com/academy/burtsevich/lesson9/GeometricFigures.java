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

    public void getArea() {

        // Площадь основания параллелепипеда для основания в виде прямоуголника
        if (this instanceof Parallelepiped<?>) {
            System.out.println(((Parallelepiped<?>) this).getSideA().doubleValue() * ((Parallelepiped<?>) this).getSideB().doubleValue());
            return;
        }
        if (this instanceof Rectangle<?>) {
            System.out.println(((Rectangle<?>) this).getSideA().doubleValue() * ((Rectangle<?>) this).getSideB().doubleValue());
            return;
        }
        // Не смог придумать как реализовать запрет на вызов метода объектом класса Line,
        // не меняя при этом структуру наследования Линия - Прямоугольник - Параллелепипед и не вводя
        // новый класс как дополнительный маркер... Оставил в таком виде, т.к вызов для Линии просто не принесет результата - костыль.
        // Нужна подсказка!
    }

    public void getVolume() {
        if (this instanceof Parallelepiped<?>){
            System.out.println(
                    ((Parallelepiped<?>) this).getSideA().doubleValue() * ((Parallelepiped<?>) this).getSideB().doubleValue() * ((Parallelepiped<?>) this).getSideC().doubleValue()
            );
        }
    }


}
