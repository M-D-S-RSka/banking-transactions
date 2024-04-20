package org.example.cards;

public class CreditCard extends BankCard {

    private final double creditLimit;
    private double creditBalance;

    public CreditCard(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public void topUpYourBankCard(double amount) {
        if (creditBalance < 0) {
            double remainingAmount = Math.min(Math.abs(creditBalance), amount);
            creditBalance += remainingAmount;
            amount -= remainingAmount;
        }
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public boolean pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            double remainingAmount = amount - balance;
            if (creditLimit >= remainingAmount) {
                creditBalance -= remainingAmount;
                balance = 0;
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public String getAvailableFundsInfo() {
        return "Available funds in Credit Card: Balance: " + balance + ", Credit Limit: " + creditLimit;
    }
}