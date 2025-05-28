package com.practice.javapractice;

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
      7) Interface is abstract in nature*/

}
