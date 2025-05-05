package org.example;

public class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств!");
        }
    }

    public void displayInfo() {
        System.out.println("Счет: " + accountNumber + ", Баланс: " + balance);
    }
}
