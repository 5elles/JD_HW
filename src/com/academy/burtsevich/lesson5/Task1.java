package com.academy.burtsevich.lesson5;

public class Task1 {
    public static void main(String[] args) {
        SimpleClass one = new SimpleClass();
        SimpleClass two = new SimpleClass(50, 'q');
        System.out.println("Геттер дефолтного значения поля \"a\": " + one.getA());
        System.out.println("Геттер дефолтного значения поля \"b\": " + one.getB());
        System.out.println("_____________________________________");
        System.out.println("Меняем значения полей для объекта \"two\" при помощи сеттеров");
        two.setA(100);
        two.setB('Y');
        System.out.println("Геттер измененного значения поля \"a\": " + two.getA());
        System.out.println("Геттер измененного значения поля \"b\": " + two.getB());
    }
}
