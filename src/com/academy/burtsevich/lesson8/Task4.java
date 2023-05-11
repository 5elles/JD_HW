package com.academy.burtsevich.lesson8;

import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String s = "Listen to the news from today and read the text at the same time. Listen to the news from today without reading the text.";
        countUniqueWords(s);
    }

    public static void countUniqueWords(String s) {
        String[] strings = s.trim().split(" ");
        String[] controlStrings = new String[strings.length];
        Pattern pattern = Pattern.compile("\\b[A-z]+\\b");

        for (int j = 0; j < strings.length; j++) {
            strings[j] = cleanTheString(strings[j]);
        }

        int index = 0;
        for (String string : strings) {
            Matcher matcher = pattern.matcher(string);
            if (!searchTheWord(controlStrings, string.toLowerCase().strip()) && matcher.matches()) {
                controlStrings[index] = string.toLowerCase().strip();
                index++;
            }
        }
        System.out.println(index);
    }

    public static String cleanTheString(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if (!Character.isLetter(sb.charAt(i))) {
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }

    public static boolean searchTheWord(String[] array, String s) {
        boolean flag = false;
        for (String word : array) {
            if (word != null && Objects.equals(word, s)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
