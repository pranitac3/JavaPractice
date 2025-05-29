package com.practice.javapractice.AbstractPractice;

public class AbstractTest {

    public static void main(String[] args) {

        ChildClassAbstractPractice child = new ChildClassAbstractPractice();

        child.add();
        child.multi();
        child.div();

        ChildClassAbstractPractice.TestMethod();
        AbstractPractice.TestMethod();

        int b = child.a;
        System.out.println(b);

        String s1= ChildClassAbstractPractice.s;
        System.out.println(s1);

    }
}
