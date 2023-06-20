package com.academy.burtsevich.lesson18;

import com.academy.burtsevich.lesson5.Math;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class PrintMath {
    public static void main(String[] args) {
        Math math = new Math();
        Method[] methods = math.getClass().getMethods();
        Field[] fields = math.getClass().getFields();

        for (Field field : fields) {
            System.out.printf("Поле %s  \n",
                    field.getType());
        }

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
            System.out.printf("%s %s %s(%s) \n",
                    Modifier.toString(modifiers),
                    method.getReturnType().getName(),
                    method.getName(),
                    params);
        }
    }
}
