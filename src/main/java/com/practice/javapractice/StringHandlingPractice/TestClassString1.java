package com.practice.javapractice.StringHandlingPractice;

public class TestClassString1 {

    public static void main(String[] args) {


        String student_name = "Joh,ney Sta rk:pp";

        String sq[] = student_name.split(",");

        System.out.println(sq.length);
        System.out.println(student_name.length());

        System.out.println(student_name.substring(2));

        String student_class = "Class A";
        String student_class_compare = "Class B";
        System.out.println("========================================");
        System.out.println("Length: " +student_class.length());
        System.out.println("Substring- index 1 to 4: " +student_class.substring(1, 5));
        System.out.println(student_class.substring(4));
        System.out.println(student_class.toUpperCase());
        System.out.println(student_class.charAt(3));
        System.out.println(student_class.indexOf("A"));
        System.out.println(student_class.toLowerCase());
        System.out.println(student_class.compareTo(student_class_compare)); //B comes after A , so it's -1 output





    }



}
