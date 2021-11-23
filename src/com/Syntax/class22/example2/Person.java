package com.Syntax.class22.example2;

public class Person {
    String name;
    Person (String name){
        this.name=name;
    }
    void eat(){

        System.out.println(name+" eating");
    }
    void performDailyTask(){
        System.out.println("Eat sleep repeat");
    }
}

class Employee extends Person{

    Employee(String name) {
        super(name);
    }
    void performaDailyTasks(){
        System.out.println("Working all day in office and reading emails at night");
    }
}
class Student extends Person{

    Student (String name) {
        super(name);
    }
    void performaDailyTasks(){

        System.out.println("Attending the classes at day and ");
    }
}
class Teacher extends Person{

    Teacher(String name) {

        super(name);
    }
    void performaDailyTasks(){
        System.out.println("Teaching");
    }
    void designClasses(){
        System.out.println("Create repls and design new classes");
    }
}