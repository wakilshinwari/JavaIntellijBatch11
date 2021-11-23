package ReviewClass9;

import ReviewClass8.Doctor;

public class Hospital {
    public static void main(String[] args) {
        Doctor d1=new Doctor("Naolla","Ali", "Cardiologies");
        d1.printInfo();   //can access only public members in different packages
        System.out.println(d1.name);
        System.out.println(d1.lastName);
        Doctor.hospital="ABC Hospital";
    }
}
