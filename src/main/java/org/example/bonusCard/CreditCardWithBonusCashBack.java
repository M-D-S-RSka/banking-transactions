package org.example.bonusCard;

import org.example.cards.CreditCard;

public class CreditCardWithBonusCashBack extends CreditCard {

    private double bonusCashback;

    public double getBonus() {
        return bonusCashback;
    }

    public CreditCardWithBonusCashBack(double creditLimit) {
        super(creditLimit);
    }

    @Override
    public boolean pay(double amount) {
        boolean approved = super.pay(amount);
        if (approved && amount > 5000) {
            bonusCashback += amount * 0.05; // 5% cashback
        }
        return approved;
    }

    public void getMoneyFromBonus() {
        balance += bonusCashback;
        bonusCashback = 0;
    }

    public String getAvailableFundsInfo() {
        return "Available funds in Credit Card: Balance: %s, Bonus: %s".formatted(balance, bonusCashback);
    }
}