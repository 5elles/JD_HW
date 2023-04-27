package com.academy.burtsevich.lesson5;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Student st1 = new Student(1012, "Инжектор Георгий Васильевич", "Психологии", 3, 404, 1923);
        Student st2 = new Student(1013, "Силкин Сергей Викторович", "Психологии", 3, 404, 1933);
        Student st3 = new Student(1014, "Сорокин Булат Сергеевич", "Журналистики", 2, 405, 1913);
        Student st4 = new Student(1015, "Иванов Иван Иванович", "Журналистики", 2, 405, 1913);
        Student st5 = new Student(1016, "Кашалот Виктор Сергеевич", "Журналистики", 2, 405, 1963);
        Student st6 = new Student(1017, "Сорока  Татьяна Андреевна", "Психологии", 4, 405, 1948);
        Student st7 = new Student(1018, "Круг Елена Викторовна", "Журналистики", 2, 405, 1974);
        Student st8 = new Student(1019, "Жук Светлана Петровна", "Психологии", 1, 405, 1917);
        Student st9 = new Student(1020, "Кот Владимир Владимирович", "Журналистики", 1, 405, 1985);
        Student st10 = new Student(1021, "Сырсксая Софья Олеговна", "Журналистики", 5, 405, 1987);

        Student[] students = {st1, st2, st3, st4, st5, st6, st7, st8, st9, st10};

        Administration.getStudentsOnCourse(students, 2); // подход рабочий, но в рамках ООП лучше создать объект класса администрации
        System.out.println("_____________________________________");
        Administration.getStudentsOlderThan(students, 1990);

    }
}
