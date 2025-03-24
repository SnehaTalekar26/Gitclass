package com.xworkz.accessspecifier;

public class BankRunner {
    public static void main(String[] args){
        Bank bank=new Bank();
        System.out.println("Running BankRunner");
        bank.Loan();
        bank.interest();
        bank.Balance();
    }
}
