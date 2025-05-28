package com.practice.javapractice;

public class ArrayConceptsMethodOverloading {

    public static void main(String[] args) {


        ArrayConceptsMethodOverloading arm1 = new ArrayConceptsMethodOverloading();

        int[] a; //This is only declaration

        //initialization and declaration both are on same line
        int[] ab = {10,20,30,40,50};  //dynamic array. Array size got changed as per Number of elements
        arm1.printArray(ab);

        String[] str = new String[]{"Pune", "Delhi"};
        arm1.printArray(str);

        Object[] ob = new Object[]{"Hello", 111, "World", 222};
        arm1.printArray(ob);

        double[] db = new double[]{10.10, 20.20, 30.30};
        arm1.printArray(db);

        arm1.printArray(ab, str);
        arm1.printArray(ob, db);
        arm1.printArray(ab, str, ob, db);


    }
    public void printArray(Object[] obj)
    {
        System.out.println("Print all values of object array: ");
        for(Object temp: obj) //data type, temp var, collection where we get all data
        {
            System.out.println(temp);
        }
    }
    public void printArray(int[] int_print)
    {
        System.out.println("Print all values of integer array: ");
        for(int temp: int_print) //data type, temp var, collection where we get all data
        {
            System.out.println(temp);
        }
    }
    public void printArray(String[] print_string)
    {
        System.out.println("Print all values of string array: ");
        for(String temp: print_string) //data type, temp var, collection where we get all data
        {
            System.out.println(temp);
        }
    }
    public void printArray(double[] obj)
    {
        System.out.println("Print all values of double array: ");
        for(double temp: obj) //data type, temp var, collection where we get all data
        {
            System.out.println(temp);
        }
    }

    public void printArray(int[] int_print, String[] str_print)
    {
        System.out.println("Print all values of int and string array: ");
        for(int temp: int_print) //data type, temp var, collection where we get all data
        {
            System.out.println(temp);
        }
        for(String temp: str_print)
        {
            System.out.println(temp);
        }
    }

    public void printArray(Object[] obj_print, double[] db_print)
    {
        System.out.println("Print all values of Object and double array: ");
        for(Object temp: obj_print) //data type, temp var, collection where we get all data
        {
            System.out.println(temp);
        }
        for(double temp: db_print)
        {
            System.out.println(temp);
        }
    }
    public void printArray(int[] int_print, String[] str_print, Object[] obj_print, double[] db_print)
    {
        System.out.println("Print all values of all types of array: ");
        for(int temp: int_print)
        {
            System.out.println(temp);
        }
        for(String temp: str_print)
        {
            System.out.println(temp);
        }
        for(Object temp: obj_print) //data type, temp var, collection where we get all data
        {
            System.out.println(temp);
        }
        for(double temp: db_print)
        {
            System.out.println(temp);
        }
    }

}
