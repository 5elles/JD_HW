package com.academy.burtsevich.lesson6;

public class Student extends Man{
    private int year;

    public Student(String name, String sex, int age, double weight, int year) {
        super(name, sex, age, weight);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void increaseYear(int number){
        this.year += number;
    }

}
