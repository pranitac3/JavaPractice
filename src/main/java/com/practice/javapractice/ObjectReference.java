package com.practice.javapractice;

public class ObjectReference {

    //Below are global variables
    String model;
    int wheel;

    public static void main(String[] args) {

        ObjectReference vehicle1 = new ObjectReference();
        ObjectReference vehicle2 = new ObjectReference();
        ObjectReference vehicle3 = new ObjectReference();

        vehicle1.model = "Car";  //these are instance variable
        vehicle1.wheel = 4;

        vehicle2.model = "Auto";
        vehicle2.wheel = 3;

        vehicle3.model = "Truck";
        vehicle3.wheel = 6;

        System.out.println("Model: " +vehicle1.model +" And "+ "Wheel: " +vehicle1.wheel);
        System.out.println("Model: " +vehicle2.model +" And "+ "Wheel: " +vehicle2.wheel);
        System.out.println("Model: " +vehicle3.model +" And "+ "Wheel: " +vehicle3.wheel);

        vehicle1 = vehicle2;
        vehicle2 = vehicle3;
        vehicle3 = vehicle1;

        System.out.println("Vehicle1 reference object shifted to Vehicle2: " +vehicle1.model +" And " +vehicle1.wheel);
        System.out.println("Vehicle2 reference object shifted to Vehicle3: " +vehicle2.model +" And " +vehicle2.wheel);
        System.out.println("Vehicle3 reference object shifted to Vehicle3: " +vehicle3.model +" And " +vehicle3.wheel);

        /*it's output is as below:

        Vehicle1 reference object shifted to Vehicle2: Auto And 3
        Vehicle2 reference object shifted to Vehicle3: Truck And 6
        Vehicle3 reference object shifted to Vehicle3: Auto And 3

        Vehicle 3 has vehicle 2 value because Vehicle 1 is already shifted to vehicle 2

         */


    }
}
