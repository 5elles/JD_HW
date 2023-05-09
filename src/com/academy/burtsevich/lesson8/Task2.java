package com.academy.burtsevich.lesson8;

import java.util.Objects;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String str = getString();
        str = normalizeString(str);
        System.out.println(str);
    }

    public static String getString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку:");
        return input.nextLine();
    }

    public static String normalizeString(String str) {
        String string = str.trim();
        while (string.contains("  ")) {
            string = string.replace("  ", " ");
        }
        return string;
    }

    // не работает
    // при вводе "	jhb	 kjb	k	jbkj	bk 	kjbk	j 	f sdkjf sdnkjfn skaj     skjdnfksj d          "
    // получил ответ "jhb	 kjb	k	jbkj	bk 	kjbk	j 	f sdkjf sdnkjfn skaj skjdnfksj d"

}
