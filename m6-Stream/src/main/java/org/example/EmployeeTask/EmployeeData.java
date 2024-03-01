package org.example.EmployeeTask;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll() {
        return Stream.of(
                new Employee(100, "Mike", "mike@cydeo.com", Arrays.asList("2022099887", "123239812")),
                new Employee(101, "Ozzy", "ozzy@cydeo.com", Arrays.asList("2022025687", "123232122")),
                new Employee(102, "Peter", "peter@cydeo.com", Arrays.asList("2022034887", "123232312"))

        );
    }
}
