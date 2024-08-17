package com.oops.encapsulation.example;

public class Account {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;  // balance = balance + amount
        }else{
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && balance >= amount){
            balance -= amount;  // balance = balance - amount
        }else{
            System.out.println("Invalid withdrawal amount");
        }
    }
}
class AccountHolder {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        System.out.println("Balance : "+account.getBalance());

        System.out.println("withdraw : 2000.");

        account.withdraw(2000);
        System.out.println("Balance : "+account.getBalance());

    }
}
