package ReviewClass9.ReveiewClass10;

class Animal{
    public void eat (){
        System.out.println("All animals eat");
    }
}
public class Dog extends Animal {
    public void bark(){
        System.out.println("Dog barks");
    }
    public void sleep(){
        System.out.println("Dog sleeps");
    }
}

class Puppy extends Dog{
    //overriding method
    public void bark(){
        System.out.println("Puppy barks");
    }
    public void drinkMilk(){
        System.out.println("Puppy drinks milk");
    }
    //overrind method eat
    public void eat(){
        System.out.println("Puppy eats");
    }
}