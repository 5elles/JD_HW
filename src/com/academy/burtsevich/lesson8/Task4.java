package com.academy.burtsevich.lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String str = "Listen to the news from today and read the text at the same time. Listen to the news from today without reading the text.";

        System.out.println();
        System.out.print("Количество уникальных слов в строке: ");
        System.out.println(countUniqueWords(str));
    }

    public static int countUniqueWords(String str) {
        Pattern pattern = Pattern.compile("\\b[A-z]+\\b");
        String[] arr = str.trim().split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cleanString(arr[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            Matcher matcher = pattern.matcher(s);
            if (sb.indexOf(s.toLowerCase()) < 0 && matcher.matches()) {
                sb.append(s.toLowerCase()).append(" ");
            }
        }
        return sb.toString().split(" ").length;
    }

    public static String cleanString(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if (!Character.isLetter(sb.charAt(i))) {
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }
}
