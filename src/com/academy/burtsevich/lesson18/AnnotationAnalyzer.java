package com.academy.burtsevich.lesson18;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationAnalyzer {
    public static void parse(Bean aClass) {
        Class<?> clazz = aClass.getClass();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Param.class)) {
                try {
                    System.out.printf("%s: %s\n", method.getName(),
                            method.invoke(aClass, method.getAnnotation(Param.class).a(), method.getAnnotation(Param.class).b())
                    );
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
