package com.practice.javapractice;

public class DataConversionWrapperClass {

    public static void main(String[] args) {


        String x ="100";
        System.out.println(x+20); //This will give 100+20

        //Integer is wrapper class. We have wrapper class for each data type
        int i = Integer.parseInt(x);
        System.out.println(i+20); //This will give 120 because string to int conversion is happened


        String j = "A100";
        Integer.parseInt(j); //it will throw error - NumberFormatException because j has alphanumeric value. it should be pure alphabets.
    }
}
