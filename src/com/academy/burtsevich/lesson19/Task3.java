package com.academy.burtsevich.lesson19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");

        List<String> del3 = myList.stream()
                .filter(s -> !s.contains("3"))
                .toList();

        List<String> sortedByNum = del3.stream()
                .sorted(Comparator.comparingInt(o -> o.charAt(1)))
                .toList();

        List<String> sortedByLetter = sortedByNum.stream()
                .sorted((o1, o2) -> o2.charAt(0) - o1.charAt(0))
                .toList();

        List<String> skippedAndLimited = sortedByLetter.stream()
                .skip(1)
                .limit(4)
                .toList();

        List<String> upperCased = skippedAndLimited.stream()
                .map(String::toUpperCase)
                .toList();

        long count = upperCased.stream().count();

        System.out.println("Изначальный список: " + myList);
        System.out.println("Удалить все строки, содержащие “3”: " + del3);
        System.out.println("Отсортировать по числу (по возрастанию): " + sortedByNum);
        System.out.println("Отсортировать по букве (по убыванию): " + sortedByLetter);
        System.out.println("Отбросить первый и последний элементы: " + skippedAndLimited);
        System.out.println("Привести в upperCase: " + upperCased);
        System.out.println("Выдать на печать результат: ");
        upperCased.forEach(System.out::println);
        System.out.println("Напечатать количество оставшихся элементов: " + count);
    }
}
