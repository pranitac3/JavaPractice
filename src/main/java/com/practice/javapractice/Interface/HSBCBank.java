package com.practice.javapractice.Interface;

public class HSBCBank implements USBank, BrazilBank {

    @Override
    public void credit() {
        System.out.println("Credit");
        System.out.println(HSBCBank.min_bal);
    }

    @Override
    public void debit() {

        System.out.println("Debit");
    }

    @Override
    public void transferMoney() {
        System.out.println("TransferMoney");
    }

    public void educationalLoan()
    {
        System.out.println("Educational Loan");
    }
    public void carLoan()
    {
        System.out.println("Car Loan");
    }

    @Override
    public void mutualFund() {
        System.out.println("Mutual Fund");
    }


}
