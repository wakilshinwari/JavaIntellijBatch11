package ReviewClass8;

    public class Cardiologist extends Doctor{
        public Cardiologist(String name, String lastName, String specialty){
            super(name, lastName, specialty);
        }

        public static void main(String[] args) {
            Cardiologist smith=new Cardiologist("john", "Smith", "Cardiologist");
            smith.printInfo();
            smith.treatPatient("Jack");
            smith.work();

        }
        }



