package com.practice.javapractice.StringHandlingPractice;

public class StringBufferPractice {

    public static void main(String[] args) {

        //String buffer and string builder

        //These are used to make string Mutable (can be modify)
        //String buffer - Synchronized
        //-> This is thread safe for multi threading
        //-> If anything changes - it will visible to all

        //String builder - Non synchronized
        //-> This is not thread safe


        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.append("Selenium"));

        System.out.println(sb.charAt(4));
        System.out.println(sb.indexOf("llo"));
        System.out.println(sb.reverse());


        StringBuilder sb1 = new StringBuilder("Class B");
        //System.out.println(sb1.append("Java"));

        StringBuilder sb2 = new StringBuilder("Class B");

        System.out.println(sb1.toString().compareTo(sb2.toString()));




    }
}
