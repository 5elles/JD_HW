package com.academy.burtsevich.lesson7;

import java.io.Serializable;
import java.util.Objects;

abstract class Employee implements Serializable {
    private String firstName;
    private String lastName;
    private int id;

    private static final long SERIALIZABLE = 1L;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void work(Document document) {
        System.out.println("Файл \"" + document.getDocsName() + "\"  обрабатывается! ");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null | !(other instanceof Employee)) {
            return false;
        } else {
            Employee otherEmployee = (Employee) other;
            return Objects.equals(this.getFirstName(), otherEmployee.getFirstName()) && Objects.equals(this.getLastName(), otherEmployee.getLastName());
        }

    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + ", id: " + this.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
