package com.academy.burtsevich.lesson12;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Set<Integer> hashSets = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> integerTreeSet = new TreeSet<>(Arrays.asList(3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("Пересечение двух множеств: " + getCross(hashSets, integerTreeSet));
        System.out.println("Объединение двух множеств: " + getUnion(hashSets, integerTreeSet));
    }

    public static <T> Set<T> getCross(Set<T> a, Set<T> b) {
        HashSet<T> hashSet = new HashSet<>(a);
        hashSet.retainAll(b);
        return hashSet;
    }

    public static <T> Set<T> getUnion(Set<T> a, Set<T> b) {
        HashSet<T> hashSet = new HashSet<>(a);
        hashSet.addAll(b);
        return hashSet;
    }

}
