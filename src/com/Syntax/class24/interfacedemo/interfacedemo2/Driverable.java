package com.Syntax.class24.interfacedemo.interfacedemo2;

public interface Driverable {
    void drive();

}
//we can have a class
class Bike implements Driverable{
    @Override
    public void drive() {
        System.out.println("Driving a bike");
    }
}
class Car implements Driverable{
    @Override
    public void drive() {
        System.out.println("Drriving a car");
    }
}