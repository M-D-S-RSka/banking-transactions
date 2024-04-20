package org.example;

import org.example.bonusCard.CreditCardWithBonusCashBack;
import org.example.bonusCard.DebitCardWithBalanceBonus;
import org.example.bonusCard.DebitCardWithBonus;
import org.example.cards.BankCard;
import org.example.cards.CreditCard;
import org.example.cards.DebitCard;

public class Main {
    public static void main(String[] args) {

        System.out.println("Экземпляр класса debitCard без бонусов");
        BankCard debitCard = new DebitCard();
        debitCard.topUpYourBankCard(5000);
        System.out.println("Debit Card Balance: " + debitCard.getBalance());
        System.out.println("Debit Card Available Funds: " + debitCard.getAvailableFundsInfo());
        System.out.println("Debit Card Payment Result: " + debitCard.pay(2500));
        System.out.println("Debit Card Available Funds after Payment: " + debitCard.getAvailableFundsInfo() + "\n");

        System.out.println("Экземпляр класса creditCard без бонусов");
        BankCard creditCard = new CreditCard(5000);
        creditCard.topUpYourBankCard(57000);
        creditCard.pay(62000);
        System.out.println("Credit Card Balance: " + creditCard.getBalance());
        System.out.println("Credit Card Available Funds: " + creditCard.getAvailableFundsInfo());
        System.out.println("Credit Card Payment Result: " + creditCard.pay(62000));
        System.out.println("Credit Card Available Funds after Payment: " + creditCard.getAvailableFundsInfo() + "\n");

        System.out.println("Экземпляр класса debitCardWithBonus с бонусами 1% bonus points");
        DebitCardWithBonus debitCardWithCashBack = new DebitCardWithBonus();
        debitCardWithCashBack.topUpYourBankCard(5000);
        debitCardWithCashBack.pay(3000);
        debitCardWithCashBack.getMoneyFromBonus(); //переводим бонусы в баланс
        System.out.println("Debit Card Balance: " + debitCardWithCashBack.getBalance());
        System.out.println("Debit Card Total Funds: " + debitCardWithCashBack.getAvailableFundsInfo() + "\n");

        System.out.println("Экземпляр класса debitCardWithBalanceBonus с бонусами 0.005%");
        DebitCardWithBalanceBonus debitCardWithBalanceBonus = new DebitCardWithBalanceBonus();
        debitCardWithBalanceBonus.topUpYourBankCard(50000);
        debitCardWithBalanceBonus.getMoneyFromBonus(); //переводим бонусы в баланс
        System.out.println("Debit Card Balance: " + debitCardWithBalanceBonus.getBalance());
        System.out.println("Debit Card Total Funds: " + debitCardWithBalanceBonus.getAvailableFundsInfo() + "\n");

        System.out.println("Экземпляр класса creditCardWithBonusCashBack с бонусами 5% cashback");
        CreditCardWithBonusCashBack creditCardWithBonusCashBack = new CreditCardWithBonusCashBack(10000);
        creditCardWithBonusCashBack.pay(5001);
        creditCardWithBonusCashBack.getMoneyFromBonus(); //переводим бонусы в баланс
        System.out.println("Credit Card Balance: " + creditCardWithBonusCashBack.getBalance());
        System.out.println("Credit Card Total Funds: " + creditCardWithBonusCashBack.getAvailableFundsInfo());
    }
}