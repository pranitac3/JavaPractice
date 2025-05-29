package com.practice.javapractice.inheritance;

public class BMW extends Car{


    @Override
    public void start() {
        System.out.println("---BMW start---");
        super.start();

    }
    public void safety()
    {
        System.out.println("----BMW safety---");
    }


}
