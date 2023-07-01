package com.academy.burtsevich.lesson21;

import java.util.Objects;

public class Task1 {
    public static void main(String[] args) {
        Earth earthInstance = Earth.getInstance();
        Earth earthInstance1 = Earth.getInstance();
        Moon moonInstance = Moon.getInstance();
        Moon moonInstance1 = Moon.getInstance();
        Sun sunInstance = Sun.getInstance();
        Sun sunInstance1 = Sun.getInstance();


        System.out.println(Objects.equals(earthInstance, earthInstance1));
        System.out.println(Objects.equals(moonInstance, moonInstance1));
        System.out.println(Objects.equals(sunInstance, sunInstance1));
    }


}
