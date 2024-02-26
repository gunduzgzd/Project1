package org.example;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        // Predicate<Integer> pred =   (p) -> p % 2 == 0 ? true : false;

        Calculate addition = (x, y) -> System.out.println(x + y);
        Calculate addition1 = (x, y) -> Calculator.findSum(x, y);

        //Reference to a Static Method
        Calculate s = Calculator::findSum;
        s.calculate(10, 20);

        //Reference to an instance method

        Calculator obj = new Calculator();
        Calculate s1 = obj::findMultiply;
        s1.calculate(10, 20);

        Calculate s2 = new Calculator()::findMultiply;

        BiFunction<String, Integer, String> function = (str, i) -> str.substring(i);
        BiFunction<String, Integer, String> function2 = String::substring;

        Function<Integer,Double> function3 = new MyClass()::method;
        BiFunction<MyClass,Integer,Double> function4 = MyClass::method;







    }
}