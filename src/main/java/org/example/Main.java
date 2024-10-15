package org.example;

import org.example.logic.ChocolateDispenserBusinessLogic;

/*
TDD
Нужно сделать логику автомата по выдаче шоколадок.
Необходимо вычислить количество выдаваемых шоколадок
1. На вход поступают деньги (доллары, целое число)
2. Стоимость одной шоколадки - 1 доллар
3. Скидки:
при за 4 доллара к 4 шоколадкам получаем 1 в подарок
при за 10 долларов к 10 шоколадкам получаем 5 в подарок, на получаемые шоколадки не применяются другие скидки.
при за 50 долларов к 50 шоколадкам получаем 50 в подарок, на получаемые шоколадки не применяются другие скидки.
4. Если сумма меньше 1 - бросать RuntimeException

Пример:
При оплате 65 долларов, должны получить:
50 (+ 50 в подарок) за 50 долларов, осталось 15 долларов
10 (+ 5 в подарок) за 10 долларов, осталось 5 долларов
4 (+ 1 в подарок) за 4 доллара, остался 1 доллар
1 за 1 доллар
Итого:
за 65 долларов получаем (50 + 50) + (10 + 5) + (4 + 1) + 1 = 121 шоколадку
 */
public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Give some dollars!");
            return;
        }
        int dollars = 0;
        try {
            dollars = Integer.valueOf(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Only count of dollars!");
            return;
        }

        ChocolateDispenserBusinessLogic logic = null;
        System.out.println("Count of chocolate: " + logic.calculateChocolateCount(dollars));
    }
}