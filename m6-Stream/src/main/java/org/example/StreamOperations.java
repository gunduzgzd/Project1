package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        // list.forEach(System.out::println);

        //FILTER
        System.out.println("Filter");
        list.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        //DISTINCT
        System.out.println("distinct");
        Stream<Integer> str = list.stream()
                .filter(i -> i % 2 == 0)
                .distinct();

        str.forEach(System.out::println);

        //LIMIT
        System.out.println("limit");
        list.stream()
                .filter(i -> i % 2 == 0)
                .limit(1)
                .forEach(System.out::println);


        //SKIP
        System.out.println("skip");
        list.stream()
                .filter(i -> i % 2 == 0)
                .skip(1)
                .forEach(System.out::println);


        //MAP
        System.out.println("map");
        list.stream()
                .map(number -> number * 2)
                .filter(i -> i % 3 == 0)
                .forEach(System.out::println);




    }
}
