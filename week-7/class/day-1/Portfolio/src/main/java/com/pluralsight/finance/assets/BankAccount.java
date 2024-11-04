package com.pluralsight.finance.assets;

import com.pluralsight.finance.interfaces.Account;
import com.pluralsight.finance.interfaces.Valuable;

public class BankAccount implements Valuable, Account {
    private String name, accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public double getValue() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public double getTotalBalance() {
        return this.balance;
    }
}
