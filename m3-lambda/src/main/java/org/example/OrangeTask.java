package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrangeTask {

    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();

        inventory.add(new Orange(300,Color.GREEN));
        inventory.add(new Orange(100,Color.RED));
        inventory.add(new Orange(200,Color.GREEN));
        inventory.add(new Orange(50,Color.RED));

        OrangeFormatter orangeLambda = orange -> "An orange of" + orange.getWeight()+ "g";
        prettyPrintOrange(inventory,orangeLambda);

        prettyPrintOrange(inventory,orange -> "An orange of" + orange.getWeight()+ "g");


    }

    private static void prettyPrintOrange(List<Orange>inventory, OrangeFormatter formatter ) {
        for (Orange orange :inventory){
            String output = formatter.accept(orange);
            System.out.println(output);
        }

    }

}
