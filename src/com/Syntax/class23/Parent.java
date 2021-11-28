package com.Syntax.class23;

import javax.xml.bind.SchemaOutputResolver;

public class Parent {
    private final String NAME="Fatma";
    protected final int AGE=20;
    public final double WEIGHT_OF_AVG_HUMAN = 30;
    final double HEIGTH = 5.4;

    //lwt is declare them
    static final int NO_OF_LEGS=2;
    private final void printName(){
        System.out.println(NAME);
    }
    final void printAge(){
        System.out.println(AGE);
    }
    protected final void printHeigth(){
        System.out.println(HEIGTH);
    }
    public final void printWeigth(){
        System.out.println(WEIGHT_OF_AVG_HUMAN);
    }
    public static final void printNoOFLegs(){
        System.out.println(NO_OF_LEGS);
    }

}
