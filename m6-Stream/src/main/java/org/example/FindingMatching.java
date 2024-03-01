package org.example;

import org.example.DishTask.Dish;
import org.example.DishTask.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {
    public static void main(String[] args) {

        //ALL MATCH
        boolean isHealthy = DishData.getAll().stream()
                .allMatch(dish -> dish.getCalories() < 1000);

        System.out.println(isHealthy);

        //ANY MATCH
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)) {
            System.out.println("The menu is vegetarian friendly");
        }

        //NON MATCH
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy2);

        //FIND ANY

        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish);
        System.out.println(dish.get());

        //FIND FIRST

        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2.get());

        //PARALLEL STREAMS (Async)

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(IntStream.range(0, 100).parallel().findAny().getAsInt());
        System.out.println(IntStream.range(0, 100).parallel().findFirst());

        List<String> list1 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");
        List<String> list2 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");

        //  Optional<String> findFirst = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst();
        //  Optional<String> findAny = list2.parallelStream().filter(s -> s.startsWith("J")).findAny();

        Optional<String> findFirst = list1.stream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny = list2.stream().filter(s -> s.startsWith("J")).findAny();

        System.out.println(findFirst.get());
        System.out.println(findAny.get());

        System.out.println("+++++++++++++++++++++++++++");

        //MIN AND MAX

       Optional<Dish> dishMin = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dishMin);

        System.out.println(DishData.getAll().stream().sorted(Comparator.comparing(Dish::getCalories)).findFirst().get());

        Optional<Dish> dishMax = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dishMax);


    }
}
