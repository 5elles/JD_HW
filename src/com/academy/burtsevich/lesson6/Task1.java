package com.academy.burtsevich.lesson6;

public class Task1 {
    public static void main(String[] args) {
        Man man1 = new Man("Федор", "Муж", 18, 100.5);
        Man man2 = new Man("Сара", "Жен", 30, 55.2);
        Student student1 = new Student("Василий", "Муж", 19, 65.9, 2010);
        Student student2 = new Student("Ольга", "Жен", 20, 55.4, 2011);
        Student student3 = new Student("Лейла", "Жен", 23, 53.8, 2015);

        System.out.println("Имя студента № 1 до переименования: " + student1.getName());
        student1.rename("Нафаня");
        System.out.println("Имя студента №1 после переименования: " + student1.getName());
        System.out.println("Год обучения студента №2 до увеличения: "+ student2.getYear());
        student2.increaseYear(5);
        System.out.println("Год обучения студента №2 после увеличения: "+ student2.getYear());
        Man man = (Man) student3;
        System.out.println("Скащенный студент №3: "+ man.getName());

    }



}
