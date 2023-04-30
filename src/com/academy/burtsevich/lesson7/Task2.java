package com.academy.burtsevich.lesson7;

import java.util.Objects;

public class Task2 {
    public static void main(String[] args) {
        Accountant accountant = new Accountant("Elena", "Petrova", 1001);
        Intern intern = new Intern("Bill", "Gates", 1002);
        Document document1 = new Document("d_1", 5);
        Document document2 = new Document("d_2", 1);
        Document document3 = new Document("d_3", 3);
        Document document4 = new Document("d_4", 2);
        Document document5 = new Document("d_5", 1);
        Document document6 = new Document("d_6", 4);
        Document document7 = new Document("d_7", 2);
        Document document8 = new Document("d_8", 12);
        Letter letter1 = new Letter("Деду морозу", 2);
        Letter letter2 = new Letter("Письмо себе", 1);
        Letter letter3 = new Letter("Письмо себе", 1);


        System.out.println("___________________");
        System.out.println("Проверка метода work: ");
        intern.work(document6);
        accountant.work(document1);
        System.out.println("___________________");
        System.out.println("Проверка навыка бухгалтера делать документы неактуальными: ");
        System.out.println();
        System.out.println("Параметры двух документов до изменения: ");
        System.out.println(document7 +", актуальность: " + document7.isRelevance());
        System.out.println(document8 +", актуальность: " + document7.isRelevance());
        System.out.println();
        accountant.makeIrrelevant(document7, document8);
        System.out.println();
        System.out.println("Параметры документов после: ");
        System.out.println(document7 +", актуальность: " + document7.isRelevance());
        System.out.println(document8 +", актуальность: " + document7.isRelevance());
        System.out.println("___________________");
        System.out.println("Интерн подсчитывает среднее арифметическое от количества страниц в релевантных документах:");
        System.out.println("Среднее арифметическое: " + intern.getAverageOfDocs(document1, document2, document7, document8));
        System.out.println("___________________");
        System.out.println("Интерн получает статистику по переданным ему документам: ");
        intern.getDocsStatistics(document1, document2, document3, document4, document5, document6, document7, document8);
        System.out.println();
        System.out.println("___________________");
        System.out.println("Работа с объектами нового класса Letter: ");
        System.out.println();
        accountant.makeIrrelevant(letter2);
        intern.getDocsStatistics(letter1, letter2);
        System.out.println();
        System.out.println("Проверка на equals: " + Objects.equals(letter2, letter3));
        System.out.println(accountant);




    }
}
