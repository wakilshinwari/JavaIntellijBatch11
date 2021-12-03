package ReviewClass9.ReveiewClass10;

public abstract class Teacher extends Human{
    protected double salary;

    public Teacher(String name, String lastName, double salary){
        super(name, lastName);
    }
    public void teach(){
        System.out.println("Every Teacher taach");
    }
    public void getPaid(){
        System.out.println("Teacher gets paid"+ salary);
    }
    public abstract void takeExam();
}

class MathTeacher extends Teacher {
    String subject;

    public MathTeacher(String name, String lastName, double salary, String math) {
        super(name, lastName, salary);
        this.subject=subject;
        //overloading: same name within the same class
        //rules: method signature  must be different (by # and type of the parameters)
        //return type and access modifiers can be different
        //we cab overload private and static methods
    }
    public void speak() {
        System.out.println(name + " " + lastName+" speaks math langauge");
    }
    public void takeExam(){
        System.out.println( name+ " "+ lastName+ "takes the exam" );
    }
    public void hasVacation(){
        System.out.println(name+ " "+ lastName+ " have 30 days vacation");
    }

    //overriding teach method    == same method name within sub and super calss
    //rules of Orriding=  when my child class  1. inheritance
    // 2. method signature( name+ parameters) + return type must be the same
    // we cannot overrid static
    public void teach (){
        System.out.println(name+"teaches"+ subject);
    }
}
