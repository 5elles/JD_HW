package com.academy.burtsevich.lesson19;

import java.util.*;
import java.util.stream.Collectors;


public class Task1 {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>(Arrays.asList(
                "login lj;", "b", "one", "a rat", "two", "thr!ee", "collection"
        ));

        boolean login = col.stream()
                .anyMatch(s -> s.contains("login"));

        String maxString = col.stream()
                .max(Comparator.comparingInt(String::length))
                .get();

        String minString = col.stream()
                .min(Comparator.comparingInt(String::length))
                .get();

        List<String> list = col.stream()
                .filter(s -> s.matches("[A-z]*"))
                .toList();


        String[] s = String.join(" ", col).split(" ");

        Set<String> strings = Arrays.stream(s)
                .filter(s1 -> s1.matches("[A-z]*"))
                .collect(Collectors.toSet());



        System.out.println("Коллекция содержит \"login\": " + login);
        System.out.println("Самая длинная строка: " + maxString);
        System.out.println("Самая короткая строка: " + minString);
        System.out.println("Строки-слова: " + list);
        System.out.println("Все слова из строк: " + strings);

    }
}
