package com.xworkz.external;

import com.xworkz.internal.Bank;

public class SavingsAccount extends Bank {

    double balance = 10000;
    double interestRate =10050;
    public void accountInfo() {
        System.out.println("Savings account balance: ₹" + balance + " with interest " + interestRate + "%");
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        b.accountInfo();

        SavingsAccount s = new SavingsAccount();
        s.accountInfo();

        Bank bs = new SavingsAccount();
        bs.accountInfo();
    }
}
