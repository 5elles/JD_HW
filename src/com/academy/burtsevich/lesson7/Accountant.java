package com.academy.burtsevich.lesson7;

public class Accountant extends Employee{

    public Accountant() {
    }

    public Accountant(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
    }

    public void makeIrrelevant(Document... documents){
        for (Document document: documents) {
            super.work(document);
            document.setRelevance(false);
        }


    }
}
