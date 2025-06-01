package com.practice.javapractice.GetterSetterPractice;

public class TestClassB {

    public static void main(String[] args) {

        TestClassA a = new TestClassA("Tom Stark", 101);

        //by using getter setter we can access private variable in another class.

        //a.setEmpid(100);
       // a.setName("abcd".toUpperCase()); //These are string method and applicable for string data type only

        //System.out.println(a.getName() + a.getEmpid());

        System.out.println(a.toString());

    }
}
