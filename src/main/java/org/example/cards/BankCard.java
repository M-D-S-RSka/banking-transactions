package org.example.cards;

public abstract class BankCard {

    protected double balance;

    public void topUpYourBankCard(double amount) {
        balance += amount;
    }

    public boolean pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public abstract String getAvailableFundsInfo();
}