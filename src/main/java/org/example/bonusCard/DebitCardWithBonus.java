package org.example.bonusCard;

public class DebitCardWithBonus extends BonusBankCard {

    @Override
    public boolean pay(double amount) {
        boolean success = super.pay(amount);
        if (success) {
            bonus += amount * 0.01; // 1% bonus points
        }
        return success;
    }
}