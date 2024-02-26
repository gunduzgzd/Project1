package org.example;

import java.util.function.BiFunction;
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

        //two argument constructors

        BiFunction<String,Integer,Car> a = (made,model)-> new Car(made,model);

        BiFunction<String,Integer,Car> b = Car::new;
        Car honda=b.apply("Honda",2020);
        System.out.println(honda.getModel()+" "+honda.getMake());







    }
}
