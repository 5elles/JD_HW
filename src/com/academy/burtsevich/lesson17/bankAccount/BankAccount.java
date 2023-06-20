package com.academy.burtsevich.lesson17.bankAccount;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class BankAccount {

    public AtomicInteger count = new AtomicInteger(0);
//    по условию поле должно быть double, использовать volatile нельзя.
//    т.к. атомарного класса такого нет, я пытался выкрутиться при помощи
//    потокобезопасных коллекций и очередей - не получилось. Вопрос: как double
//    сделать атомарным без volatile? Пока использовал AtomicInteger.

    public void decrease() {
        count.addAndGet(- 200) ;
    }

    public void increase() {
        count.addAndGet(100) ;

    }
}
