package com.Syntax.class22.Task1;

public class Student {
    /*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
     */
    //we difine some methods first

    void study(){
        System.out.println("Students must study");
    }
    void doHomeWork(){
        System.out.println("Students must do homework");
    }
    void practice(){
        System.out.println("Students must practice");
    }
}
//we create classes
class SyntaxStudent extends Student{   //let's override some methods
    @Override
    void study(){
        System.out.println("students must study 25 hours a week");
    }
    @Override
    void doHomeWork(){
        System.out.println("Students must solve repls");
    }
    void doResearch(){
        System.out.println("Syntax students do addtional research");
    }
}
class CollegeStudents extends Student { //created a new class
    @Override
    void doHomeWork() {
        System.out.println("Students must do homeWork");
    }
    class SchoolStudent extends Student{

    }
}