package org.example;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList(); //arraylist only accepts objects belong to Integer class
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        //items.add("Apple");

        printDoubled(items);

        System.out.println("*****************************");

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<SoccerPlayer> liverpool = new Team("Liverpool"); //Team accepting any object
        //liverpool.addPlayer(joe);
        //liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);




    }

    private static void printDoubled(ArrayList<Integer> items) {
        for (int i : items) {

            System.out.println(i*2);

        }
    }
}
