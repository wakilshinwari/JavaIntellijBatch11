package com.Syntax.class23.abstraction;

public abstract class Phone {

void makePhoneCalls(){
    System.out.println("Making a call");
}
void sendText(){
    System.out.println("Sending a text");
}

abstract void displayPictures();
abstract void unlockPhone();

}
class Iphone extends Phone{
    @Override
    void displayPictures(){
        System.out.println("Iphone uses photos app to display the pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("Use FacID unlock the phone");
    }
}
class Samsung extends Phone{
    @Override
    void unlockPhone() {
        System.out.println("Use fingerprint sensor to unlock the phone");

    }

    @Override
    void displayPictures() {
        System.out.println("Use the gallary pics to");

    }
}