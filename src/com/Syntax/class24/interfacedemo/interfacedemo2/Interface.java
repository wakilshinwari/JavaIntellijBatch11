package com.Syntax.class24.interfacedemo.interfacedemo2;

public interface Interface {
    default void method1(){
        System.out.println("I am a default method in Interface");
        //I can have implementation here

        }
    static void method2(){
        System.out.println("I am a static method in Interface");
    }
}
class Test implements Interface{

}
class Main{
    public static void main(String[] args) {
        Interface.method2();
        //Interface.method1(): not allowed for default methods
        Interface I1=new Test();
        I1.method1();
        new Test().method1();

    }
}
