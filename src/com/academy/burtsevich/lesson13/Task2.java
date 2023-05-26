package com.academy.burtsevich.lesson13;

public class Task2 {
    public static void main(String[] args) throws DateException {
        Notepad notepad = new Notepad();

        notepad.addNote("11-02-1990", "Третий");
        notepad.addNote("01-02-1945", "Первый");
        notepad.addNote("12-12-1995", "Четвертый");
        notepad.addNote("20-01-2023", "Пятый");
        notepad.addNote("08-09-1976", "Второй");

        System.out.println();
        System.out.println(
                "Возвращаем Note по дате: \n" +
                        notepad.getNote("20-01-2023")
        );
        System.out.println();
        System.out.println("Список от оближайшей даты к дальней");
        System.out.println(notepad.getAllNotes());
    }
}
