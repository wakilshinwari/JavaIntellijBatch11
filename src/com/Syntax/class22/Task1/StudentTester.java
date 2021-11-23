package com.Syntax.class22.Task1;

public class StudentTester {

    public static void main(String[] args) {
        Student [] students={new CollegeStudents(), };
                for (Student s:students){
                    s.study();
                    s.doHomeWork();
                    s.practice();
                    if (s instanceof SyntaxStudent){
                        ( (SyntaxStudent)s).doResearch();
                    }
                }
    }
}
