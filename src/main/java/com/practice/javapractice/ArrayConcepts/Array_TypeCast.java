package com.practice.javapractice.ArrayConcepts;

public class Array_TypeCast {

    public static void main(String[] args) {

        String[] ab = {"200", "100"};

        int[] pq = new int[ab.length];

        System.out.println(ab.length);

            for(int i=0 ; i<=ab.length; i++)  //one by one value will get parse
            {
                try {
                    pq[i] = Integer.parseInt(ab[i]);
                    System.out.println(pq[i]);
                }
                catch (Exception e) {  //Exception is parent class
                    System.out.println(e.getMessage());

                }
            }

        System.out.println("Hello");

    }

//    public void printArray(Object[] obj)
//    {
//        System.out.println("Print all values of object array: ");
//        for(Object temp: obj) //data type, temp var, collection where we get all data
//        {
//            System.out.println(temp);
//        }
//    }
}
