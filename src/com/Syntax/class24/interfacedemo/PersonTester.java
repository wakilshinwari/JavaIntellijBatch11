package com.Syntax.class24.interfacedemo;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new SDETInstructor();
        person.eat();
        person.sleep();
       // person.teach();

        Employee employee =new SDETInstructor();
        employee.work();
       // employee.eat();//we cannot call this method

        SyntaxEmployees syntaxEmployees=new SDETInstructor();
        syntaxEmployees.teach();
        syntaxEmployees.work();
        syntaxEmployees.sleep();
    }
}
