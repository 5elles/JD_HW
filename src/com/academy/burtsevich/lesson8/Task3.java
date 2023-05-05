package com.academy.burtsevich.lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Task3 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Меняем 4 и 7 буквы в тексте на \"#\": ");
        System.out.println(getMadText(Text.textBlock));
        System.out.println();
        System.out.println("Выводим слова, начинающиеся с согласной и заканчивающиеся гласной буквой: ");
        printWords(Text.textBlock);


    }

    public static String getMadText(String str) {

        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() >= 4) {
                StringBuilder temp = new StringBuilder(arr[i]);
                if (Character.isLetterOrDigit(temp.charAt(3))) {
                    temp.setCharAt(3, '#');
                }

                if (arr[i].length() >= 7) {
                    if (Character.isLetterOrDigit(temp.charAt(6))) {
                        temp.setCharAt(6, '#');
                    }
                }
                arr[i] = temp.toString();
            }
        }
        return String.join(" ", arr);
    }

    public static void printWords(String str) {
        Pattern pattern = Pattern.compile("\\b[BCDFGHJKLMNPQRSTVWXZbcdfghjklmnpqrstvwxz][a-z]+[AEIOUYaeiouy]\\b");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }
    }
}
