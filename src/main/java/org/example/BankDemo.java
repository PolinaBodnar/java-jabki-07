package org.example;

public class BankDemo {
    public static void main(String[] args) {
        Account[] accounts = new Account[2];
        accounts[0] = new SavingsAccount("SA123", 2000, 0.05);
        accounts[1] = new CreditAccount("CA456", 500, 1000);

        for (Account acc : accounts) {
            acc.withdraw(1200);
            acc.displayInfo();
        }

        ((SavingsAccount)accounts[0]).applyInterest();
        accounts[0].displayInfo();
    }
}
