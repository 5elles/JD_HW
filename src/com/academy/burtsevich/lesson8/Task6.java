package com.academy.burtsevich.lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        String str = "Listen k1_%!+to@mail.su the 'k;kj;nn_ljl.p^^erson@gmail.cOm.ru-.  jl;aj[;kl/neUl-c_a!t@mail.ruws from to@day.com and -+375298904356read the text at the ti+9187390762me. jljslfjlsjfakjlkljljkjkjkjkjkjkjkjkjkasdfsfadfasdfaasdfasdfafasdfaffadf@ljljl.jljljkljljljlkjljkkjiafncmnkjhjkhuhhjhuunuhuugkbcadf.com";
        System.out.println();
        System.out.println("Emails: ");
        System.out.println();
        getEmails(str);
    }

    public static void getEmails(String s){
        Pattern pattern = Pattern.compile("[\\w^!$%+-\\.=?{}&]+@[A-z0-9\\-\\.]+\\.[A-z0-9-]+[A-z0-9]");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            if (matcher.group().length() < 50){  // :) так и не понял, как ограничить сложносоставную строку в полном объеме, а не по отдельным элементам
                System.out.println(matcher.group());
            }
        }
    }
}
