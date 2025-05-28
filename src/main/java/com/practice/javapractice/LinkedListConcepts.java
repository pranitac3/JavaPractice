package com.practice.javapractice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcepts {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList<>();

        ll.add("test");
        ll.add("selenium");
        ll.add("QTP");
        ll.add("RPM");

        //print
        System.out.println(ll);
        //add first
        ll.addFirst("Apple");
        System.out.println(ll);
        //add last
        ll.addLast("Banana");
        System.out.println(ll);

        //get
        System.out.println(ll.get(0));

        //set
        ll.set(0, "Orange");
        System.out.println(ll);

        //remove first and last element
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

        //remove on the basis of index
        ll.remove(3);
        System.out.println(ll);

        //print all values
        for(int i=0; i<ll.size(); i++)
        {
            System.out.println(ll.get(i));
        }

        //advanced for loop
        //We know that all values are of String type -- NOT WORKING
        System.out.println("----Advanced for loop-----");
        for(Object str: ll)
        {
            System.out.println( str);
        }

        //iterator
        System.out.println("---print using Iterator----");
        Iterator<Object> it = ll.iterator() ;
        while (it.hasNext()){
            System.out.println(it.next());

        }

        //while loop
        System.out.println("---While Loop----");
        int num=0;
        while (ll.size() > num){
            System.out.println(ll.get(num));
            num++;
        }

    }
}
