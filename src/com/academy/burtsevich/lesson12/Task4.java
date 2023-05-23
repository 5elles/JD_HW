package com.academy.burtsevich.lesson12;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Set<Integer> hashSetInt = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Double> hashSetDouble = new HashSet<>(Arrays.asList(1.0, 10.0, 3.2, 4.0, 5.0, 5.7));
        Set<Long> hashSetLong = new HashSet<>(Arrays.asList(1L, 2L, 3L, 4L, 5L));
        Set<Integer> integerTreeSet = new TreeSet<>(Arrays.asList(3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("Пересечение нескольких множеств: " + getCross(hashSetInt, hashSetDouble, hashSetLong));
        System.out.println("Объединение нескольких множеств: " + getUnion(hashSetInt, integerTreeSet, hashSetDouble, hashSetLong));
    }

    public static Set<? extends Number> getCross(Set<? extends Number> a, Set<? extends Number>... sets) {
        HashSet<Double> hashSet = convertSetIntoDouble(a);
        for (Set<? extends Number> set : sets) {
            HashSet<Double> hashSet1 = convertSetIntoDouble(set);
            hashSet.retainAll(hashSet1);
        }
        return hashSet;
    }

    public static Set<? extends Number> getUnion(Set<? extends Number> a, Set<? extends Number>... sets) {
        HashSet<Double> hashSet = convertSetIntoDouble(a);
        for (Set<? extends Number> set : sets) {
            HashSet<Double> hashSet1 = convertSetIntoDouble(set);
            hashSet.addAll(hashSet1);
        }
        return hashSet;
    }

    public static HashSet<Double> convertSetIntoDouble(Set<? extends Number> numberSet) {
        HashSet<Double> doubleHashSet = new HashSet<>();
        Iterator<? extends Number> iterator = numberSet.iterator();
        while (iterator.hasNext()) {
            doubleHashSet.add(iterator.next().doubleValue());
        }
        return doubleHashSet;
    }
}
