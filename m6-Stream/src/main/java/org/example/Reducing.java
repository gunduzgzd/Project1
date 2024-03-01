package org.example;

import org.example.DishTask.Dish;
import org.example.DishTask.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 5, 3, 9);

        int sum = 0;
        for (Integer number : numbers) {
            sum = sum + number;
        }

        int result = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(result);

        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> a + b);
        System.out.println(result2.get());

        int totalCal = DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce(0, Integer::sum);

        System.out.println(totalCal);

        int totalCal1 = DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce(Integer::sum).get();

        System.out.println(totalCal1);

        //Max and Min

        int min = numbers.stream().reduce(0, Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        System.out.println(numbers.stream().reduce(Integer::sum).get());


        System.out.println(min);
        System.out.println(max.get());

        //COUNT

        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);








    }
}
