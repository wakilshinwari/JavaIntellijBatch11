package ReviewClass9.ReveiewClass10;

public class DogTest {
    public static void main(String[] args) {
        Puppy p= new Puppy();
        p.sleep();
        p.bark();
        p.drinkMilk();

        System.out.println("*******************");

        Dog dog=new Puppy();
        //run time polymorphism happens here
        dog.bark();
        dog.sleep();
        //compilar givers access to the methods based on the reference type
        //Java executes based on the object type
      Animal animal = new Puppy();
      animal.eat();
    }

}
