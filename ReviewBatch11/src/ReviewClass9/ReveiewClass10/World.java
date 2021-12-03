package ReviewClass9.ReveiewClass10;

public class World {
    public static void main(String[] args) {

        MathTeacher math=new MathTeacher("John", "Smith" , 4000, "Math");
          //from human
           math.printInfo();
           Human.sleep();
           Human.eat();

           //from teacher class
        math.getPaid();
        math.takeExam();

        //from MathTeacher
        //compile time polymorphysioum ==we achieve it through method overloading
        //static or early binding
        math.speak();
        math.teach();
        //Run time polymorphysiu ==we can achieve it through method overriding ( dynamic or late bidning

       Teacher teacher= new MathTeacher("Jane", "Doe", 45000, "math");

        }
    }


