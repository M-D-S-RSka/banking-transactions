package org.example.cards;

public class DebitCard extends BankCard {

    @Override
    public String getAvailableFundsInfo() {
        return "Available funds in Debit Card: " + balance;
    }
}