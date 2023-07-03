package com.academy.burtsevich.lesson5;

public class Student {
    private int id, course, group, yearOfBirth;
    private String fullName, faculty;

    public static int count = 0;

    Student(int id, String fullName, String faculty, int course, int group, int yearOfBirth) {
        count++;
        this.id = id;
        this.fullName = fullName;
        this.faculty = faculty;
        if (course > 5 | course < 1) {
            throw new RuntimeException("Ошибка в выборе курса!");
        } else {
            this.course = course;
        }
        this.group = group;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCourse(int course) {
        if (course > 5 | course < 1) {
            throw new RuntimeException("Ошибка в выборе курса!");
        } else {
            this.course = course;
        }
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void sayHello() {
        System.out.println("Меня зовут " + this.getFullName());
    }
}
