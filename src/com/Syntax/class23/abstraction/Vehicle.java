package com.Syntax.class23.abstraction;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public abstract class Vehicle {
    String vinNumber;
    static int totalVehicles;
    //abstract vechile ( abstract not allowed with consructors}
Vehicle (String vinNumber){
    totalVehicles++;
    this.vinNumber=vinNumber;
    System.out.println("Grandpas constructor is called");
}

    public void printVehicleCount(){
        System.out.println(totalVehicles+" Vehicle creating");

    }
    public void drive(){
        System.out.println("Vehicle is driving ");
    }
    public void stop(){
        System.out.println("Vehicle stopping");

    }
    public abstract void start ();

    }
    abstract class Car extends Vehicle{
    String carType;
    Car (String carType, String vinNumber){
        super (vinNumber);
        this.carType=carType;
        System.out.println("Parent constructor is called");
    }
    public void drive(){
        System.out.println("Care is driving");
    }
    public abstract void speed();
}


