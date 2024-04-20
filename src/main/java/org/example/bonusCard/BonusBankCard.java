package org.example.bonusCard;

import org.example.cards.BankCard;

public abstract class BonusBankCard extends BankCard {

    protected double bonus;

    public double getBonus() {
        return bonus;
    }

    public void getMoneyFromBonus() {
        balance += bonus;
        bonus = 0;
    }

    public String getAvailableFundsInfo() {
        return "Available funds in Credit Card: Balance: %s, Bonus: %s".formatted(balance, bonus);
    }
}