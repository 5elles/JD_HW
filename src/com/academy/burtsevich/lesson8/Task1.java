package com.academy.burtsevich.lesson8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String str = getString();
        str = checkForAbcAndReplace(str);
        System.out.println(str);
    }

    public static String getString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку:");
        return input.next();
    }


    public static String checkForAbcAndReplace(String str) {
        if (str.startsWith("abc")) {

            return str.replaceFirst("abc", "www");
        }
        return str.concat("zzz");
    }

}
