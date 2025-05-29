package com.practice.javapractice.AbstractPractice;

public class ChildClassAbstractPractice extends AbstractPractice{


    @Override
    void add() {
        System.out.println("---Addition---");
        multi();
        div();
        //minus method can not be accessible here as it is protected
    }

    public ChildClassAbstractPractice()
    {
        System.out.println("---child class constructor---");
    }

}
