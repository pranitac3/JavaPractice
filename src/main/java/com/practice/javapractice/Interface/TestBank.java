package com.practice.javapractice.Interface;

public class TestBank {

    public static void main(String[] args) {

        HSBCBank hs = new HSBCBank();

        //These are overridden methods from USBank
        hs.credit();;
        hs.debit();
        hs.transferMoney();
        //These are own methods of HSBCBank
        hs.educationalLoan();
        hs.carLoan();
        //This is overridden method of BrazilBank
        hs.mutualFund();

        //dynamic polymorphism
        USBank b = new HSBCBank(); //Child class object can be referred by Parent interface reference variable.

        b.credit();
        b.debit();
        b.transferMoney();
       // b.educationalLoan();  -This will give error because this is belongs to HSBCBank class - these are not overridden method. Only and oly overridden method can be accessible

        System.out.println(USBank.min_bal); //min_bal is by default static nature. then we can access it by classname or interface name.

        //USBank.min_bal = 200;  //min_bal is static , u can not change it's value. This is not allowed.

        System.out.println(USBank.min_bal);
    }
}
