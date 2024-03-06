package org.example.java9;

import java.util.*;

public class FactoryMethodsDemo {

    public static void main(String[] args) {

        //Creating an unmodifiable list before Java9

        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java","Spring","Agile"));

       // courses.get("TS");
        System.out.println(courses);

        //Creating an unmodifiable list after Java9

        List<String> myCourses = List.of("Java","Spring","Agile");

        //Creating an unmodifiable set after Java9

        Set<String> myProducts = Set.of("Milk","Bread","Butter");

        //Creating unmodifiable Map after Java9
        Map<String,Integer> myCart = Map.ofEntries(
                Map.entry("Samsung TV",1),
                Map.entry("PSP",1),
                Map.entry("Chair",5)
        );





    }
}
