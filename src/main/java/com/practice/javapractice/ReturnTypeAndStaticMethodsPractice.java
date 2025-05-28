package com.practice.javapractice;

public class ReturnTypeAndStaticMethodsPractice {

    public static void main(String[] args) {

        ReturnTypeAndStaticMethodsPractice obj = new ReturnTypeAndStaticMethodsPractice();

        //obj - is object reference name
        //new ReturnTypeAndMethodsPractice() - This is object.
        obj.test();

        int a = obj.addition();
        System.out.println("Addition is: " +a);

        String s = obj.stringtest();
        System.out.println("String is: " +s);

        int d = obj.division(50, 10);
        System.out.println("division is: " +d);

    }
    //return type void - void does not return any value
    public void test() //no input no output
    {
        System.out.println("This is test method");
    }

    //return type int
    public int addition() //no input, some output
    {
        System.out.println("This is addition method: ");
        int a=10;
        int b=20;
        int c=a+b;

        return c;
    }
    //return type string
    public String stringtest()
    {
        System.out.println("This is stringtest method: ");
        String s = "Selenium";
        return s;
    }

    //int return type
    //x, y are parameter
    public int division(int x, int y)
    {
        System.out.println("This is division method: ");
        int z = x/y;
        return z;
    }
}
