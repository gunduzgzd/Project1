package org.example;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        //print all emails

        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        //print all phone numbers

        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumber().stream())
                .forEach(System.out::println);

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumber)
                .flatMap(List::stream)
                .forEach(System.out::println);




    }
}
