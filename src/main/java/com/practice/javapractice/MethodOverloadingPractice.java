package com.practice.javapractice;

public class MethodOverloadingPractice {

    public static void main(String[] args) {

        //Method overloading- When the method name is same with different arguments or input parameters within the class.

        MethodOverloadingPractice mo = new MethodOverloadingPractice();
        mo.sum();
        mo.sum(10);
        mo.sum(10, 20);
    }

    public void sum()
    {
        System.out.println("Zero parameters");
    }
    public void sum(int i)
    {
        System.out.println("One parameters");
        System.out.println(i);
    }
    public void sum(int a, int b)
    {
        System.out.println("Two parameters");
        System.out.println(a+b);
    }
}
