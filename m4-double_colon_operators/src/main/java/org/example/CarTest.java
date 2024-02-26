package org.example;

import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        //zero argument constructor

        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());

        //one argument constructor

        Function<Integer,Car> f1= model -> new Car(model);
        Function<Integer,Car> f2= Car::new;




    }
}
