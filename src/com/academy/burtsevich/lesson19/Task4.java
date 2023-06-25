package com.academy.burtsevich.lesson19;

import java.util.*;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        Map<String, Set<Integer>> initialMap = new HashMap<>() {{
            put("123", Set.of(1, 2, 3, 4));
            put("234", Set.of(2, 3, 4, 5));
            put("345", Set.of(3, 4, 5, 6));
            put("456", Set.of(4, 5, 6, 7));
        }};

        Map<Integer, Set<String>> result = new HashMap<>();
        Set<Map.Entry<String, Set<Integer>>> entries = initialMap.entrySet();


        Stream.of(entries)
                .forEach(entries1 -> {
                    entries1.forEach(stringSetEntry -> {
                        String key = stringSetEntry.getKey();
                        Set<Integer> value = stringSetEntry.getValue();
                        value
                                .forEach(integer -> {
                                    if (!result.containsKey(integer)) {
                                        Set<String> stringSet = Set.of(key);
                                        result.put(integer, stringSet);
                                    } else {
                                        Set<String> newSet = new HashSet<>(result.get(integer));
                                        newSet.add(key);
                                        result.put(integer, newSet);
                                    }
                                });
                    });
                });
        result.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
