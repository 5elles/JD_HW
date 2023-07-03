package com.academy.burtsevich.lesson5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AdministrationTest {
    Administration administration = new Administration(1, "Вася");

    Student[] students = new Student[]
            {
                    new Student(1, "A", "Первый", 1, 1, 2000),
                    new Student(2, "B", "Второй", 1, 2, 2001),
                    new Student(3, "C", "Третий", 3, 3, 2002)
            };

    @Test
    public void testGetId() {
        assertEquals(1, administration.getId());
    }

    @Test
    public void testGetFullName() {
        assertEquals("Вася", administration.getFullName());
    }

    @Test
    public void testSetId() {
        administration.setId(2);
        assertEquals(2, administration.getId());
    }

    @Test
    public void testSetIdWrongNumber() {
        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> administration.setId(0));
        assertEquals("ID не может быть меньше 1", runtimeException.getMessage());
    }

    @Test
    public void testSetFullName() {
        administration.setFullName("Уася");
        assertEquals("Уася", administration.getFullName());
    }

    @Test
    public void testGetStudentsOnCourse() {
        Map<Integer, String> studentsOnCourse = administration.getStudentsOnCourse(students, 1);
        Map<Integer, String> studentsOnCourseExpected = new LinkedHashMap<>();
        studentsOnCourseExpected.put(1, "A");
        studentsOnCourseExpected.put(2, "B");
        assertEquals(studentsOnCourse, studentsOnCourseExpected);
    }

    @Test
    public void testGetStudentsOlderThan() {
        int birthYear = 2001;
        Map<Integer, String> studentsOlderThan = administration.getStudentsOlderThan(students, birthYear);
        Map<Integer, String> studentsOlderThanExpected = new LinkedHashMap<>();
        studentsOlderThanExpected.put(1, "C");
        assertEquals(studentsOlderThanExpected, studentsOlderThan);
    }

    @Test
    public void testGetStudentsOlderThanWrongYear1() {
        int birthYear = 1856;
        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> administration.getStudentsOlderThan(students, birthYear));
        assertEquals("Ошибка в дате рождения", runtimeException.getMessage());
    }
    @Test
    public void testGetStudentsOlderThanWrongYear2() {
        int birthYear = 2023;
        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> administration.getStudentsOlderThan(students, birthYear));
        assertEquals("Ошибка в дате рождения", runtimeException.getMessage());
    }

}
