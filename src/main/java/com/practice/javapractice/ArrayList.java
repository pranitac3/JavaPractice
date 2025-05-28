package com.practice.javapractice;

public class ArrayList {

    public static void main(String[] args) {

        java.util.ArrayList ar = new java.util.ArrayList<>();

        ar.add(100);
        ar.add(200);
        ar.add(300);

        System.out.println(ar.size()); //Output is 3

        ar.add(400);
        ar.add(500);
        System.out.println(ar.size()); //output is 5

        ar.add("abc");
        ar.add("xyz");
        System.out.println(ar.size()); //output is 7

        ar.remove(6); //using this we can remove value as well using indexing

        //Print all values of ArrayList
        for (int i=0; i<ar.size(); i++)
        {
            System.out.println(ar.get(i));
        }

        java.util.ArrayList<Integer> ar_int = new java.util.ArrayList<>();

        ar_int.add(100);
        //ar.int("abcd"); //This is not allowed because Integer arraylist we used
    }
}
