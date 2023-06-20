package com.academy.burtsevich.lesson18;

import java.lang.reflect.*;
import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {
        Class<LinkedList> aClass = LinkedList.class;


        // родительский класс
        System.out.printf("Родительский класс: %s\n",aClass.getSuperclass());

        // поля класса
        Field[] fields = aClass.getDeclaredFields();
        System.out.printf("Поля класса: \n");
        for (Field field : fields) {
            System.out.printf("         Поле %s  \n",
                    field.getType());
        }

        // методы класса
        Method[] methods = aClass.getDeclaredMethods();
        System.out.println("Матоды класса: ");
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            StringBuilder params = new StringBuilder();
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                if (params.length() > 0) {
                    params.append(", ");
                }
                params.append(parameter.getParameterizedType());
            }
            System.out.printf("         %s %s %s(%s) \n",
                    Modifier.toString(modifiers),
                    method.getReturnType().getName(),
                    method.getName(),
                    params);
        }

        // конструкторы класса
        Constructor<?>[] constructors = aClass.getConstructors();
        System.out.println("Конструкторы класса: ");
        for (Constructor<?> constructor:constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (Class<?> parameter : parameterTypes){
                System.out.printf("         %s\n", parameter.getName());
            }
        }
        // внутренние классы
        Class<?>[] declaredClasses = aClass.getDeclaredClasses();
        System.out.println("Внутренние классы: ");
        for (Class<?> c : declaredClasses) {
            System.out.printf("         %s\n", c.getName());
        }
    }



}
