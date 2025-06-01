package com.practice.javapractice.StringHandlingPractice;

public class TestClassStringPractice {

    public static void main(String[] args) {

        String emp_name = "David";

        String student_name = "David";

        String teacher_name = new String("David");

        boolean b = emp_name.equals(student_name);
        boolean b1 = emp_name==student_name;
        boolean b2 = emp_name.equals(teacher_name);
        boolean b3 = emp_name==teacher_name;

        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        //String is immutable (Can not modify) - We can not change value of string
        //String is stored in string pool

        //difference between equals and ==

        //String pool == all string values are stored
        //equals = matches exact string. It checked - are they having same text?
        //== -> this matches which location in string pool. Matches with reference. It checked - are they having same object?


    }
}
