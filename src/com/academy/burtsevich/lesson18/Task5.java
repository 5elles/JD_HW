package com.academy.burtsevich.lesson18;

public class Task5 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Class<?> aClass = Class.forName(Bean.class.getName());
        Bean bean = (Bean) aClass.newInstance();
        AnnotationAnalyzer.parse(bean);

    }
}
