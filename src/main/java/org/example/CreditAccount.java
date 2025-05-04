package org.example;

public class CreditAccount extends Account {
    private double creditLimit;

    public CreditAccount(String accountNumber, double balance, double creditLimit) {
        super(accountNumber, balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -creditLimit) {
            balance -= amount;
        } else {
            System.out.println("Превышен кредитный лимит!");
        }
    }
}
