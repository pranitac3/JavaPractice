package com.practice.javapractice.inheritance;

public class TestCar {
    public static void main(String[] args) {

        //child class object
        BMW bmw = new BMW(); //static polymorphism , compile time polumorphism
        //This start() method is present in parent and child both. Same method name with zero argument.
       //whenever method is common in child class and parent class , then preference will be giving to child class always
        //This is called method overriding
        bmw.start(); //This is overridden method
//        bmw.stop(); //This is from parent class
//        bmw.refuel(); //this is from parent class
//        bmw.safety(); //This is from child class
//        bmw.engine(); //This is from Vehicle - grand parent class


        //Static, private, final - not allowed to override
        //Constructor also can't override.
        //Multiple inheritance not supported in Java. We can achieve it using interface.

        //Car class object
//        Car c = new Car();
//        c.start();
//        c.stop();
//        c.engine();
//
//        Vehical v = new Vehical();
//        v.engine();
        System.out.println("=============================================");
        Audi audi = new Audi();
        audi.audiStart();
        audi.audiStop();


        //Top casting
//        Car c1 = new BMW();   //This called dynamic polymorphism or runtime poymorphism
//        //Child class object can be referred by parent class reference variable.
//        //only by creating parent class reference variable is created. u can refer bmw object but can not access properties
//        c1.start(); //Here child class method will get called. This is overridden method
//        c1.stop();
//        c1.refuel();
        //c1.safety - this method can not be accessible by just creating parent class reference variable
        //only and only overriden methods and parent class methods can be accessble in dynamic polymorphism


        //Down casting
        //BMW b1 = new Car(); //This is giving error
        //To achive on above
        //BMW b1 = (BMW)new Car(); //This is allowed but it will give you Class Cast Exception



    }
}
