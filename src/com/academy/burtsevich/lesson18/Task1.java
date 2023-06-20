package com.academy.burtsevich.lesson18;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Task1 {
    public static void main(String[] args) {
        String s = "";
        Method[] declaredMethods = s.getClass().getMethods();
        for (Method method:declaredMethods) {
            int modifiers = method.getModifiers();
            if (!Modifier.isStatic(modifiers)){
                System.out.println("name: " + method.getName());
            }
        }
    }
}
