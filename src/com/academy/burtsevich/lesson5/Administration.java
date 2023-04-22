package com.academy.burtsevich.lesson5;

public class Administration {

    public void sayHello(Student student) {
        System.out.println("Меня зовут " + student.getFullName());
    }


    public static void getStudentsOnCourse(Student[] students, int course) {
        System.out.println("Студенты, обучающиеся на " + course + " курсе:");
        int count = 0;

        for (Student student : students) {
            if (student.getCourse() == course) {
                ++count;
                System.out.println(count + ". " + student.getFullName());
            }
        }
    }

    public static void getStudentsOlderThan(Student[] students, int year){
        if (year < 1900 | year > 2020){
            System.out.println("Проверьте год");
        } else {
            int count = 0;
            System.out.println("После " + year + " года родились: ");
            for (int i = 0; i < students.length; i++) {
                if (students[i].getYearOfBirth() > year){
                    ++ count;
                    System.out.println(count + ". " + students[i].getFullName() + ", " + students[i].getYearOfBirth() + " г.р.");
                }

            }
        }
    }
}
