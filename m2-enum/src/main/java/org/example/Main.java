package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Apple a = new Apple(5);


        System.out.println("How to access a constant");

        Currency c = Currency.NICKLE;
        System.out.println(c);
        System.out.println(Currency.DIME);

        System.out.println("How to access all constants");
        Currency[] currencies = Currency.values();

        System.out.println(Arrays.toString(currencies));

        for (Currency currency : currencies) {
            System.out.println(currency);
        }

        System.out.println("How to use switch-case with enum");

        switch (Currency.PENNY) {
            case PENNY:
                System.out.println("it is 1 cent");
                break;
            case NICKLE:
                System.out.println("it is 5 cents");
                break;
            case DIME:
                System.out.println("it is 10 cent");
                break;
            case QUARTER:
                System.out.println("it is 25 cents");
                break;
        }

        System.out.println("Operation Task");

        calculate(3,5,Operation.MINUS);

        System.out.println("how to retrieve the constant value");

        System.out.println(Currency.NICKLE.getValue());

        System.out.println(Currency.QUARTER.getValue());

        System.out.println(Currency.QUARTER.ordinal()); //3 index






    }

    private static void calculate(double x, double y, Operation operation) {

        switch (operation) {
            case PLUS:
                System.out.println(x + y);
                break;
            case MINUS:
                System.out.println(x - y);
                break;
            case DIVIDE:
                System.out.println(x / y);
                break;
            case MULTIPLY:
                System.out.println(x * y);
                break;
        }

    }


}
 