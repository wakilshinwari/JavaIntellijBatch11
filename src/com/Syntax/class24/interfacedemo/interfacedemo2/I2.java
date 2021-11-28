package com.Syntax.class24.interfacedemo.interfacedemo2;

interface I3 {
    void method();
    int age=10;
    static void method2(){
        System.out.println(" I am method2 from interface 1");

    }
}
interface I2{
    void method();
    int age=20;

    static void method2(){
        System.out.println("I am mehtode2 form interace 2");
    }
}
class TestClass implements I3, I2{

    @Override
    public void method() {
        System.out.println("I will be cllaed for both the method from both interfcaes");

    }
}
class main{
    public static void main(String[] args) {
        I3 i1=new TestClass();
        i1.method();
        I2 i2= new TestClass();
        i2.method();
        I3.method2();
        I2.method2();
    }
}