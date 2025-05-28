package com.practice.javapractice;

import java.util.Hashtable;

public class HashTable {

    public static void main(String[] args) {

        Hashtable h = new Hashtable<>();
        h.put("A", "Hello");
        h.put("B", "World");
        h.put("C", "Selenium");

        System.out.println(h.size()); //output is 3

        h.put(1, 100);
        h.put(2, 200);
        h.put(3, 300);

        System.out.println(h.size()); //output is 6
        System.out.println(h.get(3)); //300 will give

        h.put(4,"Tom");

        Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
        h1.put(11, 1200);
        h1.put(12,1300);
        //h1.put("A", 400); //This is not allowed as data type restricted for h1 object reference

    }
}
