package ReviewClass8;

public class DoctorOffice {

    public static void main(String[] args) {
        Doctor doctor1=new Doctor("John", "Doe", "ENT");
        System.out.println(doctor1.name);
        System.out.println(doctor1.lastName);
        System.out.println(doctor1.speciality);
        System.out.println(doctor1.salary);
       // System.out.println(doctor1.ssn);   //it is not visible becasue it is private

        doctor1.printInfo();
        doctor1.treatPatient("Hashim");
        doctor1.work();
       // doctor1.getPaid();  // the method getPaid () it is private

       // if we make anohter doctor,
        //Doctor doctor2=new Doctor("Jame", Thre ) it give you a compilar error because it is private

    }
}
