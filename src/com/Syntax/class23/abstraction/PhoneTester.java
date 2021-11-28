package com.Syntax.class23.abstraction;

public class PhoneTester {
    public static void main(String[] args) {
        //phone phone=new Phone(); cant create the object

        Iphone iphone=new Iphone();
        iphone.displayPictures();
        iphone.unlockPhone();
        iphone.makePhoneCalls();
        iphone.sendText();
    }
}
