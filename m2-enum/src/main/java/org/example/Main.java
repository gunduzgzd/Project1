package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


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
                System.out.println("it isn 1 cent");
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


    }
}
 