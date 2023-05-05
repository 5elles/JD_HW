package com.academy.burtsevich.lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String str = "Listen to the news +58934798271089 from today and +375298904356read the text at the ti+9187390762me. ";
        System.out.println();
        System.out.println("Найденные номера телефонов: ");
        getPhoneNumbers(str);
    }


    public static void getPhoneNumbers(String str){
        Pattern pattern = Pattern.compile("\\+[0-9]{9,14}");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
