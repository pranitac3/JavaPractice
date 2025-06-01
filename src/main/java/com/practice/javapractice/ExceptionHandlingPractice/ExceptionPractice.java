package com.practice.javapractice.ExceptionHandlingPractice;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionPractice {

    public static void main(String[] args) throws FileNotFoundException {

        //compile time - Checked excepption
        //immediately after typing writing code.

        //runt time - unchecked exception
        //until we will not executre

        //file not found exception
        //input output exception

        FileReader file = new FileReader("C:\\Users\\OVI\\Downloads\\");


        try {
            String[] s = new String[]{"abc", "pqr", "xyz"};
            int a1 = 100/0;
            System.out.println(s[4]);
            System.out.println(a1);
        }
        catch (ArrayIndexOutOfBoundsException ai){

            System.out.println(ai.getMessage());
        }
        catch (ArithmeticException ae){

            System.out.println(ae.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println( "Finally block"); //Always run.
        }



        //Why, what - finally
        //Finally always run with try
        //Ex: db connection - if exception returned then it will go in catch.
        //De-allocaiton of memorty

        //Can we have multiple catch block - yes
        //"Exception" which is a parent







    }
}
