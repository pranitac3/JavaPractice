package com.practice.javapractice.Interface;

public interface USBank {

    int min_bal = 100;

    public void credit();
    public  void debit();
    public  void transferMoney();

   /* 1) In interface, we don’t define method body. Only method declaration we can do.
      2) In interface, we can declare the variables and variables are by default static in nature.
      3) Variable values will not be changed.
      4) No static method in interface
      ** No static method allowed in interface - Interfaces are part of  object oriented programming concepts. It’s part of object and object can not have static methods
      5) There is no main method is interface
      6) We can not create the object of interface
      7) Interface is abstract in nature

      Que- Difference between interface and abstract class.
      Why we use interface - for 100% abstraction

      abstract method - method does have body.

      -in interface - all methods are consider as abstract through abstract word is not given.
      -Multiple inheritance can be achieved through interface
      -Variables in interface by default public.
      -default modifier Public only in interface
      -in interface - we can not declare constructor. Because we can not create object of interface

      -in abstract class can not achieve multiple inheritance
      -in abstract class - with and without body both we can declare
      -in abstract class - we can not declare constructor.

      -public static final -> Can not change value as it's final value


        -if ur implementing interface then - you are force to implement all methods. Otheriwse declare interface as abstract class

        -Interface we used for common method/variable which is fixed. Like RBI guidelines - min balance -100 and all banks needs to use this balance only
      */

}
