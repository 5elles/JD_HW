package com.academy.burtsevich.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    Student student = new Student(
            1,
            "Anders",
            "Волшебства",
            2,
            1,
            1991);

    @Test
    public void testGetId() {
        int id = student.getId();
        Assertions.assertEquals(id, 1);
    }

    @Test
    public void testGetFullName() {
        String fullName = student.getFullName();
        Assertions.assertEquals("Anders", fullName);
    }

    @Test
    public void testGetFaculty() {
        String faculty = student.getFaculty();
        Assertions.assertEquals("Волшебства", faculty);
    }

    @Test
    public void testGetCourse() {
        int course = student.getCourse();
        Assertions.assertEquals(2, course);
    }

    @Test
    public void testGetGroup() {
        int group = student.getGroup();
        Assertions.assertEquals(1, group);
    }

    @Test
    public void testGetYearOfBirth() {
        int yearOfBirth = student.getYearOfBirth();
        Assertions.assertEquals(1991, yearOfBirth);
    }

    @Test
    public void testSetId() {
        student.setId(2);
        Assertions.assertEquals(2, student.getId());
    }

    @Test
    public void testSetFullName() {
        student.setFullName("Жора");
        Assertions.assertEquals("Жора", student.getFullName());
    }

    @Test
    public void testSetFaculty() {
        student.setFaculty("Безделия");
        Assertions.assertEquals("Безделия", student.getFaculty());
    }

    @Test
    public void testSetCourse() {
        student.setCourse(5);
        Assertions.assertEquals(5, student.getCourse());
    }

    @Test
    public void testSetWrongCourse1() {
        RuntimeException runtimeException = Assertions.assertThrows(RuntimeException.class, () -> student.setCourse(0));
        Assertions.assertEquals("Ошибка в выборе курса!", runtimeException.getMessage());
    }

    @Test
    public void testSetWrongCourse2() {
        RuntimeException runtimeException = Assertions.assertThrows(RuntimeException.class, () -> student.setCourse(6));
        Assertions.assertEquals("Ошибка в выборе курса!", runtimeException.getMessage());
    }

    @Test
    public void testSetGroup() {
        student.setGroup(123);
        Assertions.assertEquals(123, student.getGroup());
    }
    @Test
    public void testSetYearOfBirth(){
        student.setYearOfBirth(2000);
        Assertions.assertEquals(2000, student.getYearOfBirth());
    }


}
