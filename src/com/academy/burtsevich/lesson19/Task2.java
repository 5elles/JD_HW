package com.academy.burtsevich.lesson19;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        Collection<Integer> col = Arrays.asList(1, 2, 1, 11, 4);

        int minNumber = col.stream()
                .min(Integer::compareTo).orElse(0);

        int maxNumber = col.stream()
                .max(Integer::compareTo).orElse(0);

        double average = (double) col.stream()
                .mapToInt(Integer::intValue)
                .sum() / col.size();

        int product = col.stream()
                .reduce(1, (integer, integer2) -> integer * integer2);

        int sum = col.stream()
                .reduce(0, Integer::sum);

        List<String> strings = col.stream()
                .map(String::valueOf)
                .toList();

        String s = strings.stream()
                .reduce((s1, s2) -> s1 + s2)
                .orElse("");

        int numbersSum = s.chars()
                .map(Character::getNumericValue)
                .reduce(0, Integer::sum);

        System.out.println("Минимальное число: " + minNumber);
        System.out.println("Максимальное число: " + maxNumber);
        System.out.println("Среднее арифметическое чисел: " + average);
        System.out.println("Произведение чисел: " + product);
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Сумма всех цифр: " + numbersSum);
    }
}
