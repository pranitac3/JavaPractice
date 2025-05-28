package com.practice.javapractice;

public class StaticAndNonStatic {


    String name =  "abc";
    static  int age = 20;
    String str;

    public static void main(String[] args) {

        //how to call static methods
        //1.direct call
        statictest();
        //2.through classname
        StaticAndNonStatic.statictest();
        System.out.println("-------------------------------------------");
        //how to call static variables
        //1.direct call
        System.out.println(age);
        //2.through classname
        System.out.println(StaticAndNonStatic.age);
        System.out.println("-------------------------------------------");

        //how to call non static method
        //create object of class and call the method
        StaticAndNonStatic sas = new StaticAndNonStatic();
        sas.test();



    }

    public void test()
    {
        str= test1("Pune");
        str = test1("Mumbai");
        System.out.println(str);

        statictest(); //This method call ebcause it's in same class
        System.out.println("This is non static method");

    }

    public static void statictest()
    {
        //test(); - This we can't access as this is not static
        System.out.println("This is static method");

    }
    public String test1(String city)
    {
        return city;
    }
}
