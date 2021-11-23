package com.Syntax.class22.example2;

import com.Syntax.class22.Father;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Teacher("Asghar");
        person.eat();
        Person person1=new Student("mykel");

        Person [] persons={new Student("Farhad"), new Employee("Naiya"), new Teacher("Asel")};

        for (Person person2:persons){
            person2.performDailyTask();

            if (person2 instanceof Teacher){
                ((Teacher)person2).designClasses();
            }
        }
    }
}
