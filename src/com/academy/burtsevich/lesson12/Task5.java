package com.academy.burtsevich.lesson12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedMap =  collectStringsIntoTheMap(); // обеспечиваем дальнейшее сжатие
        TreeMap<Integer, String> map = new TreeMap<>(linkedMap); // обеспечиваем сортировку по ключу
        System.out.println("Мапа до сжатия: ");
        System.out.println(map);
        map = squeezeMap(linkedMap);
        System.out.println("Мапа после сжатия: ");
        System.out.println(map);

    }

    private static LinkedHashMap<Integer, String> collectStringsIntoTheMap() {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        while (!Objects.equals(value.toLowerCase(), "end")) {
            map.put(getUniqueIntKey(), value);
            value = scanner.nextLine();
        }
        return map;
    }


    private static int getUniqueIntKey(){
        HashSet<Integer> intSet = new HashSet<>(20);
        int uniqueInt = (int) (Math.random() * 1_000_000) + 1;
        while (intSet.contains(uniqueInt)) {
            uniqueInt = (int) (Math.random() * 1_000_000) + 1;
        }
        intSet.add(uniqueInt);
        return uniqueInt;
    }

    private static  TreeMap<Integer, String> squeezeMap(LinkedHashMap<Integer, String> map){
        TreeMap<String, Integer> tempTreeMap = new TreeMap<>();
        TreeMap<Integer, String> answerTreeMap = new TreeMap<>();
        for (Map.Entry<Integer,String> entry : map.entrySet()){
            if (!tempTreeMap.containsKey(entry.getValue())){  // оставляем строго первое вошедшее в мапу значение
                tempTreeMap.put(entry.getValue(), entry.getKey());
            }
        }

        for (Map.Entry<String, Integer> entry : tempTreeMap.entrySet()){
            answerTreeMap.put(entry.getValue(), entry.getKey());
        }
        return answerTreeMap;
    }

}
