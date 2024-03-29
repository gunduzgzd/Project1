package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {

    public static void main(String[] args) {

        double amount1 = 374.56;
        double amount2 = 374.26;

        System.out.println(amount1 - amount2);  //0.30000000000001137

        BigDecimal b1 = new BigDecimal("374.56");
        BigDecimal b2 = new BigDecimal("374.26");
        BigDecimal b3 = BigDecimal.valueOf(374.56);

       BigDecimal b4 =BigDecimal.TEN;
       BigDecimal b5 =BigDecimal.ONE;

        System.out.println(b1.subtract(b2)); //0.30
        System.out.println(b1.add(BigDecimal.TEN));
        System.out.println(b1.multiply(BigDecimal.valueOf(15.56)));
        System.out.println(b1.multiply(new BigDecimal("15.00")));

        //.................scaling....................

        BigDecimal number1 = new BigDecimal("23.1245");
        System.out.println(number1.setScale(1, RoundingMode.CEILING));
        System.out.println(number1.setScale(2,RoundingMode.FLOOR));
        System.out.println(number1.setScale(3,RoundingMode.DOWN));

        //Do not use equals(). Use CompareTo()
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2")));
        System.out.println(new BigDecimal("3").compareTo(new BigDecimal("2")));
        System.out.println(new BigDecimal("1").compareTo(new BigDecimal("2")));

    }
}

class Employee{

    private String name;
    private BigDecimal salary;

}
