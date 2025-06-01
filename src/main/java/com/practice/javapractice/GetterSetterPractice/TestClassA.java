package com.practice.javapractice.GetterSetterPractice;

import java.util.Hashtable;

public class TestClassA {

    private String name;
    private int empid;

    //by using getter setter we can access private variable in another class.

    public  TestClassA(String name, int empid)
    {
       this.name = name;
       this.empid = empid; //this keyword we can in constructor. For current object we use this keyword.

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    @Override
    public String toString() //This is existing Java method. Need to mention override as we are overriding exsiting java's  method
    {
        return name +"  "+ empid;
    }



}
