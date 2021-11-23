package ReviewClass9;

import ReviewClass8.Doctor;

import javax.xml.soap.SAAJResult;

public class Dentist extends Doctor {
String certificate;
String office;
    public Dentist(String name, String lastName, String speciality){
        super(name, lastName, speciality);

    }
    public Dentist(String name, String lastName, String speciality, String address){
        super(name, lastName, speciality);
        this.certificate=certificate;
        this.office=office;

    }

    public static void main(String[] args) {
        Dentist doe=new Dentist ("jack", "Doe", "Dentis");
        doe.printInfo();
        doe.treatPatient("Jack");
        doe.think();
    }
}
