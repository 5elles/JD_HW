package com.academy.burtsevich.lesson3;

public class Task2 {
    public static void main(String[] args) {
        int[] sequence = new int[10000];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = i;
        }
        for (int number : sequence){
            System.out.println(number);
        }
    }
}

/*
Немного не верно понял задание. На экран нужно вывести числа от 0 до 1 сначала по одному разу, потом по два и т.д. до четырех раз.
По итогу вывод должен быть как строка ниже:
012345678900112233445566778899000111222 ... 777788889999
 */
