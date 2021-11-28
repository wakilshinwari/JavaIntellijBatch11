package com.Syntax.class24.interfacedemo;

public interface Person {
    void eat();
    void sleep();
}
interface Employee {
    void work();

}
interface SyntaxEmployees extends Employee, Person{ //this is a multiple inheritance -it is a morethan one parent
    void teach();
}
class SDETInstructor implements SyntaxEmployees{  // we provide implementatons here because they were unimplemented

    @Override
    public void eat() {
        System.out.println("Syntax Employee eating");
    }

    @Override
    public void sleep() {
        System.out.println("Syntax Employee sleeping");
    }

    @Override
    public void work() {
        System.out.println("Creting new repls");
    }

    @Override
    public void teach() {
        System.out.println("Syntax employeex teach");
    }
}
