package com.practice.javapractice.AbstractPractice;

abstract class AbstractPractice {

    abstract void add() ;

    int a=10;

     static String s = "abc";

    private void minus()
    {
        System.out.println("---Minus---");
    }

    public void multi()
    {
        System.out.println("---Multiplication---");
        minus();  //private method we can call like this
    }

    public AbstractPractice()
    {
        System.out.println("---This is constructor---");
    }

    public static void TestMethod()
    {
        System.out.println("---Test Method---");

    }
    protected void div()
    {
        System.out.println("---Division---");
    }


}

//can not be instantiated - can not crate object
//Concrete(with body) and abstract (without body) methods
//for abstract method , u hv to use abstract keyword
//abstract class can have constructor and it is called when child class object is created
//member Variables - static, final
//Abstract class can implement interface
//if class containt atleast one abstract method then class must be abstract
//abstract method can have constructor, static methods, final methods and variables

//public , protected can be accessible outside the abstract class - within the package
//default is within the same package
//private can not accessible outside the class directly
