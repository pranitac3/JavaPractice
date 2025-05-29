package com.practice.javapractice.ArrayConcepts;

public class ArrayConcepts {

    public static void main(String[] args) {


        ArrayConcepts ar1 = new ArrayConcepts();

        int[] a; //This is only declaration

        //initialization and declaration both are on same line
        Object[] ab = {10,20,30,40,50};  //dynamic array. Array size got changed as per Number of elements
        ar1.printArray(ab);

        Object[] str = new Object[]{"Pune", 100, "Delhi", 200};
        ar1.printArray(str);




        //Single dimensional array
        //This is called data type array
        //this stores only single data type values

//        int[] i = new int[4]; //initialization of array
//
//        i[0] = 10;
//        i[1] = 20;
//        i[2] = 30;
//        i[3] = 40;
//
//        System.out.println("Length of array is: " +i.length);
//        //System.out.println("Value if i[4] is: " +i[4]); //This gives error "Index 3 out of bounds for length 3"
//        System.out.println(i[0]);
//
//        //*************************************************************************
//        //Object Array
//        //This stores all data types values
//        // Object is a class
//
//        Object ob[]= new Object[4];
//
//        ob[0]= "Tom";
//        ob[1]=25;
//        ob[2]=12.12;
//        ob[3]="Pune";
//
//        System.out.println("Length of object array:" +ob.length);
//
//        //*************************************************************************
//        //Two Dimentional Array
//
//        String[][] x = new String[2][3];
//
//        x[0][0] ="Pune";
//        x[0][1] ="Mumbai";
//        x[0][2] ="Delhi";
//        x[1][0] ="Apple";
//        x[1][1] ="Orange";
//        x[1][2] ="Banana";
//
//        System.out.println("Row in array: " +x.length);  //This gives row length
//        System.out.println(x[0].length); //This gives column length. Each row has same columns.
//        System.out.println("Print all values of 2d array: ");
//        for(int row=0; row<=x.length; row++){
//            for(int col=0; col<x[0].length; col++)
//            {
//                System.out.println(x[row][col]);
//            }
//        }
//
    }
    public void printArray(Object[] obj)
    {
        System.out.println("Print all values of 2d array: ");
        for(Object temp: obj) //data type, temp var, collection where we get all data
        {
            System.out.println(temp);
        }
    }

}
