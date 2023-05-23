package com.academy.burtsevich.lesson12;

import java.util.*;

public class Task2 {
    public static <K> void main(String[] args) {
        List<K> ks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        while (!Objects.equals(value.toLowerCase(), "end")) {
            ks.add((K) value);
            value = scanner.nextLine();
        }

        Map<K, Integer> map = listToMap(ks);
        printTheMap(map);
    }

    private static <K> Map<K, Integer> listToMap(List<K> ks) {
        Map<K, Integer> map = new HashMap<>();
        for (K value : ks) {
            if (!map.containsKey(value)) {
                map.put(value, 1);
            } else {
                map.put(value, map.get(value) + 1);
            }
        }
        return map;
    }

    private static <K> void printTheMap(Map<K, Integer> map) {
        for (Map.Entry<K, Integer> entry : map.entrySet()) {
            K k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " - " + v);
        }
    }
}


