package org.example;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 1000) {
            System.out.println("Нельзя снять больше 1000 за раз!");
        } else {
            super.withdraw(amount);
        }
    }

    public void applyInterest() {
        balance += balance * interestRate;
    }
}
