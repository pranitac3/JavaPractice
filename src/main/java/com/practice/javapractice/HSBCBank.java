package com.practice.javapractice;

public class HSBCBank implements USBank, BrazilBank{

    @Override
    public void credit() {
        System.out.println("Credit");
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
