package com.xworkz.accessspecifier;

public class Bank {
    public int accNum=1234667;
    String accHolder="John";
    private int accBalance=20000;

    public void Loan(){
        System.out.println("Account number:"+accNum);
    }
    void interest(){
        System.out.println("Account Holder:"+accHolder);
    }
    private void transaction(){
        System.out.println(accBalance);
    }
    void Balance(){
        System.out.println("Account Balance:"+accBalance);
    }
}
