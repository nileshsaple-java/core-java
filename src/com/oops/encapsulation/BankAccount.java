package com.oops.encapsulation;

public class BankAccount {
    private double balance;  // Encapsulated data

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    //getter setter
    public double getBalance() {
        return balance;
    }


}