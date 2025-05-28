package com.practice.javapractice;

public class CallByValueAndReferencePractice {

    int p;
    int q;
    public static void main(String[] args) {

        CallByValueAndReferencePractice cr = new CallByValueAndReferencePractice();
        int x=10;
        int y =20;
        cr.sum(x, y); //call by value or pass by value.

        cr.p = 50;
        cr.q = 60;
        cr.swap(cr); //We have to pass reference to reference

        System.out.println(cr.p);
        System.out.println(cr.q);
    }

    public int sum(int a, int b){

        int c = a+b;
        return c;
    }
    //call by reference
    public void swap(CallByValueAndReferencePractice t){
        // t is reference variable of class
        int temp;
        temp = t.p; //temp will be 50
        t.p = t.q; //value of p will be 60
        t.q = temp; //q will be 50

    }
}
