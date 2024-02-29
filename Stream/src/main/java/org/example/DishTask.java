package org.example;

import java.util.Collections;
import java.util.Comparator;

public class DishTask {

    public static void main(String[] args) {

DishData.getAll().stream()
        .filter(p->p.getCalories()>400)
        .map(Dish::getName)
        .forEach(System.out::println);

DishData.getAll().stream()
        .map(Dish::getName)
        .map(String::length)
        .forEach(System.out::println);

DishData.getAll().stream()
        .filter(p->p.getCalories()>300)
        .limit(3)
        .map(Dish::getName)
        .forEach(System.out::println);

        System.out.println("+++++++++++++++++");

DishData.getAll().stream()
        .filter(p->p.getCalories()<400)
        .sorted(Comparator.comparing(Dish::getCalories))
        .map(Dish::getName)
        .forEach(System.out::println);


    }
}
//Print all dish's name that has less than 400 calories
//Print the length of the name for each dish
//Print three high caloric dish names (>300)
//Print all dish names that are below 400 calories in sorted