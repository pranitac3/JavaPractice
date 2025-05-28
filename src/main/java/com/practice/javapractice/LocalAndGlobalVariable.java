package com.practice.javapractice;

public class LocalAndGlobalVariable {

    //global variables
    int i=10;
    int j=20;
    public static void main(String[] args) {

        LocalAndGlobalVariable var = new LocalAndGlobalVariable();
        System.out.println("Global variable: " +var.i +" And " +var.j);

        var.test(); //We can call non static methods by object
    }

    public void test(){
         int i=15;
         int j=25;

        System.out.println("Local variable: " +i +" and " +j);


    }
}
