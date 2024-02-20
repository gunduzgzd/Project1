package org.example;

public enum Operation {

    PLUS,MINUS,MULTIPLY,DIVIDE;

    Operation(){//this constructor is going to execute to for each constant bc they are objects
        System.out.println("Constructor");
    }
}
