package org.example;

import org.example.java10.Apple;
import org.example.java9.FactoryMethodsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2,4,2,10,23);


        //.............empty()-isPresent()...............

        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent()); //false

        System.out.println(Optional.of(number).isPresent()); //true

        // System.out.println(empty.get());

        //...................ifPresent.....................

        Optional<Integer> bigNumber = number.stream().filter(x->x>100).findAny();
        bigNumber.ifPresent(System.out::println);

        //....................get().......................

       // System.out.println(bigNumber.get()); //no value present exception

        //....................orElse.......................
        System.out.println(bigNumber.orElse(5));  //else is default option case of false

        FactoryMethodsDemo f1 =new FactoryMethodsDemo();









    }
}
