package ReviewClass9.ReveiewClass10;

public abstract class Human {      //every abstract must participate in the inheritance

    protected String name, lastName;
    static  boolean brain;

    Human (String name, String lastName){
        this.name=name;
        this.lastName=lastName;
    }
    public void printInfo(){
        System.out.println(name+" "+ lastName);
    }
    static void sleep(){

    System.out.println("All Humans sleep");
    }
    static void eat(){

    System.out.println("All Humans eat");
    }
    private static void live (){
        System.out.println("This method is useless");
    }
    abstract void speak();           // i dont want to ahve th eimplementation here on this code. once you have a abstract method
    //you need to change the class to abstract as well.
    //absract mehtods can have any access modifiers except private



}
