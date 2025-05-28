package com.practice.javapractice;

import java.util.Arrays;

public class Array_TypeCast {

    public static void main(String[] args) {

        String[] ab = {"200", "100"};

        Array_TypeCast at = new Array_TypeCast();

        int i = Integer.parseInt(Arrays.toString(ab));
        System.out.println(i+20);


        at.printArray(ab);


    }

    public void printArray(Object[] obj)
    {
        System.out.println("Print all values of object array: ");
        for(Object temp: obj) //data type, temp var, collection where we get all data
        {
            System.out.println(temp);
        }
    }
}
