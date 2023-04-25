package com.academy.burtsevich.lesson6;

public class Man {
    private String name, sex;
    private int age;
    private double weight;

    public Man(String name, String sex, int age, double weight) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void rename(String newName){
        this.name = newName;
    }
}
