package com.academy.burtsevich.lesson5;

import java.util.LinkedHashMap;
import java.util.Map;

public class Administration {

    private int id;
    private String fullName;

    public Administration() {
    }


    Administration(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public int getId() {
        return this.id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setId(int id)
    {
        if (id < 1){
            throw new RuntimeException("ID не может быть меньше 1");
        }
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public Map<Integer, String> getStudentsOnCourse(Student[] students, int course) {
        int count = 0;

        Map<Integer, String> map = new LinkedHashMap<>();
        for (Student student : students) {
            if (student.getCourse() == course) {
                ++count;
                map.put(count, student.getFullName());
            }
        }
        return map;
    }

    public Map<Integer, String> getStudentsOlderThan(Student[] students, int year) {
        Map<Integer, String> map = new LinkedHashMap<>();
        if (year < 1900 | year > 2020) {
            throw new RuntimeException("Ошибка в дате рождения");
        } else {
            int count = 0;
            for (Student student : students) {
                if (student.getYearOfBirth() > year) {
                    map.put(++count, student.getFullName());
                }
            }
        }
        return map;
    }
}
