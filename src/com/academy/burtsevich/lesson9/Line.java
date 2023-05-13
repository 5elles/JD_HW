package com.academy.burtsevich.lesson9;

public class Line<T extends Number> extends GeometricFigures{
    /*наследуясь от GeometricFigures ты вынуждаешь класс line иметь методы getArea и getVolume
    что в корне не верно, ведь у линии не может быть ни площади ни объема
    то же самое касается прямоугольника, у которого нету объема

    идея задания в том, что бы класс-обработчик фигур был просто отдельным классом,
    который бы принимал в свои методы объекты нужного типа. И вот там как раз их нужно будет правильно
    параметризовать, что бы нельзя было вызвать метод getArea у линии и т.д.

     */

    private T sideA;

    public Line(){}

    public Line(T sideA) {
        this.sideA = sideA;
    }

    public T getSideA() {
        return sideA;
    }

    public void setSideA(T sideA) {
        this.sideA = sideA;
    }
}
