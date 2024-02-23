package org.example;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterface {
    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 200;
            }
        };

        //*************PREDICATE**************//

        Predicate<Integer> lesserThan = i -> i<18;

        System.out.println(lesserThan.test(20));

        //************CONSUMER***************//

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);

        //************BI CONSUMER**************//

        BiConsumer<Integer,Integer> addTwo = (x,y)->System.out.println(x+y);
        addTwo.accept(2,1);

        //*************FUNCTION*****************//

        Function<String,String> fun = s->"Hello "+s;
        System.out.println(fun.apply("Stranger"));


    }
}
