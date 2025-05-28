package com.practice.javapractice;

public class LoopingConcepts {


    public static void main(String[] args) {

        int i = 1;

        System.out.println("---------while loop------");
        while (i <= 10)
        {
            System.out.println(i);
            i++;
        }

        System.out.println("---------for loop------");
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("---------decremental------");
        for (int j=10; j>=1; j--) {
            System.out.println(j);
        }
    }

}



