package com.academy.burtsevich.lesson7;

import java.util.Objects;

public class Intern extends Employee{

    public Intern() {
    }

    public Intern(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
    }

    public double getAverageOfDocs(Document... docs){
//         "...подсчитать среднее арифметическое всех переданнных ему документов, не учитывать те, что уже не актуальны."
//        Среднее арифметическое количества страниц в документах? или речь о проценте актуальных документов?
//        Ниже считаю среднее арифметическое по страницам.

        double relevantDocs = 0;
        int pages = 0;
        if (docs != null){
            for (Document doc: docs) {
                if (doc.isRelevance()) {
                    pages += doc.getNumberOfPages();
                    relevantDocs++;
                }
            }
        }
        return pages / relevantDocs;
    }

    public void getDocsStatistics(Document... docs){
        int irrelevantDocs = 0;
        int relevantDocs = 0;
        for (Document doc:docs) {
            if (doc.isRelevance()){
                relevantDocs ++;
            } else {
                irrelevantDocs ++;
            }

        }
        System.out.printf("%-15s%-5s\n", "Всего:", docs.length);
        System.out.printf("%-15s%-5s\n", "Актуальных:", relevantDocs);
        System.out.printf("%-15s%-5s\n", "Неактуальных:", irrelevantDocs);
    }


}
