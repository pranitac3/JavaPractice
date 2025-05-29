package com.practice.javapractice.inheritance;

public class Audi extends Car{

    public void audiStart()
    {

        System.out.println("---Audi start---");
        super.start();  //supper keyward used to call parent class method
    }

    public void audiStop()
    {
        System.out.println("---Audi stop---");
        super.stop();
    }
}
