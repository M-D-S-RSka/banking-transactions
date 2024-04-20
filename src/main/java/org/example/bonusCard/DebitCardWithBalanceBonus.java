package org.example.bonusCard;

public class DebitCardWithBalanceBonus extends BonusBankCard {

    @Override
    public void topUpYourBankCard(double amount) {
        super.topUpYourBankCard(amount);
        bonus += amount * 0.00005; // 0.005% bonus accumulation
    }
}
