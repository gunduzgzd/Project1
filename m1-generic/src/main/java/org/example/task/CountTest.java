package org.example.task;

import java.util.Arrays;
import java.util.List;

public class CountTest {

    public static void main(String[] args) {

        List<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);



    }

    private static <T> int countIf(List<T> c, UnaryPredicate<T> p) {

        int count = 0;
        for (T element : c) {
            if (p.test(element)) {
                ++count;
            }
        }
        return count;
    }




}
